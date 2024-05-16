package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/standaloneconfig.xml");
		Person p=context.getBean("p1",Person.class); 
		System.out.println(p); 
		System.out.println(p.getFriends().getClass().getName());
		
		System.out.println("_______________________________________________________________");
		System.out.println(p.getFeestructure());
		System.out.println(p.getFeestructure().getClass().getName());
		
		System.out.println("__________________________________________________________________");
		System.out.println(p.getProps());
		System.out.println(p.getProps().getClass().getName());
	}

}
