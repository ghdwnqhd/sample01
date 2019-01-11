package chap04.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import chap04.spring.MemberRegisterService;

public class Main4 {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap04/appCtx5.xml");
		
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);
		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("madvirus@madvirus.net");
		regReq.setName("ÃÖ¹ü±Õ");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);
		infoPrinter.printMemberInfo("madvirus@madvirus.net");
		
		
		System.out.println("printer1 =" + ctx.getBean("printer1"));
		System.out.println("printer2 =" + ctx.getBean("printer2"));
		
	}

}
