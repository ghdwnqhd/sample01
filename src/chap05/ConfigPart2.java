package chap05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap05.spring.MemberInfoPrinter;
import chap05.spring.MemberDao;
import chap05.spring.MemberPrinter;
import chap05.spring.MemberRegisterService;

@Configuration
public class ConfigPart2 {

	@Autowired
	private MemberDao memberDao;
	
	/*@Autowired
	private ConfigPart1 configPart1;*/
	
	
	@Bean
	public MemberPrinter printer(){
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter(){
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao);
		//infoPrinter.setMemberDao(configPart1.memberDao());
		infoPrinter.setPrinter(printer());
		return infoPrinter;
	}
	
}
