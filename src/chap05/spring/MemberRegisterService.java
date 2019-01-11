package chap05.spring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import chap03.exception.AlreadyExistingMemberException;

public class MemberRegisterService {
	private MemberDao memberDao;
	
	
	public MemberRegisterService(MemberDao memberDao){
		this.memberDao = memberDao;
	}
	
	public void regist(RegisterRequest req){
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null){
			throw new AlreadyExistingMemberException("dup email " + req.getEmail());
		}
		
		Member newMember = new Member(
			req.getEmail(), req.getPassword(), req.getName(), new Date());
		
		memberDao.insert(newMember);
	}
	
	public MemberRegisterService(){
		
	}
	
	public void setMemberDao(MemberDao memberDao){
		this.memberDao = memberDao;
	}
}
