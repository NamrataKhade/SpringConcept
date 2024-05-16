package com.springcore.lifecycle;

public class Raninbow {
	private String color_name;

	public String getColor_name() {
		return color_name;
	}

	public void setColor_name(String color_name) {
		
		System.out.println("Set color");
		this.color_name = color_name;
	}

	public Raninbow(String color_name) {
		super();
		this.color_name = color_name;
	}

	public Raninbow() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Raninbow [color_name=" + color_name + "]";
	}

	public void init() {
		System.out.println("Inside init Method");

	}

	public void destory() {
		System.out.println("Inside Destory Method");
	}
}
