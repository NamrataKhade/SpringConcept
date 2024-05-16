package com.springcore.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.withoutxml")
public class JavaConfig {
	
	@Bean
	public Game getGame() {
		
		return new Game();
		
	}

	@Bean
	public Student getStudent() {

		// Creating a new student object
		Student student = new Student(getGame());
		return student;
	}
}
