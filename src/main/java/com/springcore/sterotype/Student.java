package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("ob")
@Scope("prototype")
public class Student {
	
	
	@Value("Namrata")
	private String studentName;
	@Value("Pune")
	private String city;
	
	@Value("#{temp}")
	private List<String> colors;
	
	
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	

}
