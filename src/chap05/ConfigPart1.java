package chap05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap05.spring.MemberInfoPrinter;
import chap05.spring.MemberDao;
import chap05.spring.MemberPrinter;
import chap05.spring.MemberRegisterService;

@Configuration
public class ConfigPart1 {

	@Bean
	public MemberDao memberDao(){
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc(){
		return new MemberRegisterService(memberDao());
	}
	
}
