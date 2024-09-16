package com.tnif.DependencyInjection;

public class Car implements Vehicle {
	String name;
	String Model;
	public Car() {
		super();
	}
	public Car(String name, String model) {
		super();
		this.name = name;
		Model = model;
		System.out.println("constructor is called");
		System.out.println(name + " " + model);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	
}
