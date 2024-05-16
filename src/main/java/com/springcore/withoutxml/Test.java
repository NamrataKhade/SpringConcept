package com.springcore.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		//Student student=context.getBean("firststudent",Student.class);//usin @Component
		Student student=context.getBean("getStudent",Student.class);//using @Bean

		System.out.println(student);
		student.study();
		
		
	}

}
