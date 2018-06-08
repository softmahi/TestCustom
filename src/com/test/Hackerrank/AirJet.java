package com.test.Hackerrank;

import java.io.IOException;

public class AirJet extends Airplane {
	
	public AirJet() throws IOException{
		// TODO Auto-generated constructor stub
		
		//super();
		System.out.println("In Airject");

	}
	
	



 
}
class Airplane{
	
	public Airplane() throws IOException {
		// TODO Auto-generated constructor stub
		
		System.out.println("Airplane Constructor");
		throw new IOException();
	}
	
}