package chap07.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap07.Calculator;

public class MainXmlOrder {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap07/aopOrder.xml");
		System.out.println("Zz");
		System.out.println("Zz");
		Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
		impeCal.factorial(3);
		impeCal.factorial(5);
		impeCal.factorial(5);
	}

}
