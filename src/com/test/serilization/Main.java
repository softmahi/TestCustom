package com.test.serilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Main {
	
	
		
		public static void main(String[] args) {
			
			Derived d = new Derived(10);
			
			try {
				
				OutputStream k = new FileOutputStream("ser.txt");
				ObjectOutputStream s = new ObjectOutputStream(k);
				s.writeObject(d);
				k.close();
				s.close();
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	
	
	

}
