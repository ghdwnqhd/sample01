package chap06.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import chap06.JavaConfig;

public class Main2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println("start================");
		Client2 client = ctx.getBean("client2", Client2.class);
		client.send();
		System.out.println("end==================");
		ctx.close();
	}
}
