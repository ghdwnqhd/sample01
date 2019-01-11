package chap05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap05.spring.MemberInfoPrinter;
import chap05.spring.MemberDao;
import chap05.spring.MemberPrinter;
import chap05.spring.MemberRegisterService;

@Configuration
public class JavaConfig2 {

	@Bean
	public MemberDao memberDao(){
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc(){
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public MemberPrinter printer(){
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter(){
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		return infoPrinter;
	}
}
