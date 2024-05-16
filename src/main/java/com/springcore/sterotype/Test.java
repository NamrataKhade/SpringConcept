package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext conn=new ClassPathXmlApplicationContext("com/springcore/sterotype/steroconfig.xml");
		Student stud=conn.getBean("ob",Student.class);
		System.out.println(stud);
		
		//System.out.println("________________________________________________");
		//System.out.println(stud.getColors());
		//System.out.println(stud.getColors().getClass().getName());
		
		System.out.println(stud.hashCode());//680712932--by deafult singltone scope same hashcode 
		//to chande scope we use @Scope("prototype") then we get different hashcode
		
		System.out.println("____________________________");
        Student stud2=conn.getBean("ob",Student.class);
        System.out.println(stud2.hashCode());//680712932
        
        
        System.out.println("________________________________");
        
        
        //scope using  xml file
      Teacher t1=  conn.getBean("t1",Teacher.class); 
      Teacher t2=  conn.getBean("t1",Teacher.class);
      System.out.println(t1.hashCode());
      System.out.println(t2.hashCode());


	}

}
