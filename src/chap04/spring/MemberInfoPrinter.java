package chap04.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {
	
	@Autowired(required=false)
	private MemberDao memDao;
	private MemberPrinter printer;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}
	
	@Resource(name="printer1")
	//@Qualifier("sysout")
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberInfo(String email){
		Member member = memDao.selectByEmail(email);
		if(member == null){
			System.out.println("������ ����\n");
			return;
		}
		
		printer.print(member);
		System.out.println();
	}
	
}
