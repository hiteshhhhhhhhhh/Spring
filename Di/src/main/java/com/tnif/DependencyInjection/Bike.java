package com.tnif.DependencyInjection;

public class Bike implements Vehicle{
	String name;
	String Model;
	
	public Bike() {
		super();
	}

	public Bike(String name, String model) {
		super();
		this.name = name;
		Model = model;
		System.out.println(name + " " + model);
	}
	public void info() {
		
	}
	

}
