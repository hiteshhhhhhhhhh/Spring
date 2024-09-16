package com.tns.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart; // creating a reference of heart class

	
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	
	public Human() {
		super();
	}
	public void startPumping() {
		if(heart!=null) {
			heart.pump();
			}
		else {
			System.out.println("DEAD");
		}
		
	}
	@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	}


