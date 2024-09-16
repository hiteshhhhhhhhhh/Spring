package com.tnif.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("Beannn.xml");
	    Vehicle c1 = c.getBean(Car.class);
	    System.out.println("Class Loaded");
	    
	}

}
 