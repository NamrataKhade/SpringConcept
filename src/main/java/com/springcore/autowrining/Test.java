package com.springcore.autowrining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
	ApplicationContext context	=new ClassPathXmlApplicationContext("com/springcore/autowrining/autoconfig.xml");
	
	Employee emp1=context.getBean("emp",Employee.class);
	System.out.println(emp1);
	}

}
