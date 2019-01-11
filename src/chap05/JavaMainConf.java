package chap05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import chap05.spring.MemberInfoPrinter;
import chap05.spring.MemberDao;
import chap05.spring.MemberPrinter;
import chap05.spring.MemberRegisterService;

@Configuration
@ImportResource("classpath:chap05/sub-conf.xml")
public class JavaMainConf {

	@Autowired
	private MemberDao memberDao;

	@Bean
	public MemberPrinter memberPrinter(){
		return new MemberPrinter();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc(){
		return new MemberRegisterService(memberDao);
	}
	
}
