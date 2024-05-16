package com.springcore.withoutxml;

import org.springframework.stereotype.Component;

//@Component("firststudent")
public class Student {
	
	
	private Game game;
	
	
	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}
	


	public Student(Game game) {
		super();
		this.game = game;
	}


	public void study() {
		this.game.display();
		System.out.println("Student is Reading Book");
	}

}
