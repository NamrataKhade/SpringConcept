package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/constructconfig.xml");
		Person p= (Person)context.getBean("person");
		System.out.println(p);
		
		
		Addition add=(Addition)context.getBean("add");
		
		add.doSum();
		
 	}
	
	
}
