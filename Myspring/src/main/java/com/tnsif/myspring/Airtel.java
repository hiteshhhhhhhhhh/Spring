package com.tnsif.myspring;

public class Airtel implements Sim {
	public Airtel() {
		System.out.println("constr is called");
	}
   
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Airtel for calling");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Airtel for data");
		
	}

}
