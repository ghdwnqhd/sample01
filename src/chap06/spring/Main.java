package chap06.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap06/springconf.xml");
		Client client = ctx.getBean("client", Client.class);
		System.out.println("start======");
		client.send();
		System.out.println("end========");
		ctx.close();
		System.out.println("***********");
		Client c1 = new Client();
		c1.send();

	}

}
