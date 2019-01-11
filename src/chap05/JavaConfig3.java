package chap05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap05.spring.MemberInfoPrinter;
import chap05.spring.MemberDao;
import chap05.spring.MemberPrinter;
import chap05.spring.MemberRegisterService;

@Configuration
public class JavaConfig3 {

	@Bean
	public MemberDao memberDao(){
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc(MemberDao memDao){
		return new MemberRegisterService(memDao);
	}
	
	@Bean
	public MemberPrinter printer(){
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter(MemberDao memDao, MemberPrinter memPrinter){
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memDao);
		infoPrinter.setPrinter(memPrinter);
		return infoPrinter;
	}
}
