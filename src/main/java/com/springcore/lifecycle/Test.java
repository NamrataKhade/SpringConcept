package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifeconfig.xml");

		context.registerShutdownHook();
		// Raninbow r1 = (Raninbow)context.getBean("r1");
		// System.out.println(r1);

		// System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		// Mansoon m1 = (Mansoon) context.getBean("m1");
		// System.out.println(m1);
		
		Example ex=(Example)context.getBean("ex");
		System.out.println(ex);

	}

}
