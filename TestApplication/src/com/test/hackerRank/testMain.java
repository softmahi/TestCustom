package com.test.hackerRank;

import com.test.hackerRank.FO.BAR;

public class testMain {

	public static void main(String[] args) {
		
	Base b = new Derived();
	b.show();
	System.out.println("hi::");
	
	int g=10;
	int k=20;
	
	swap(g,k);
	System.out.println("a:"+g+"-"+k);

		try {
			throw new Derived();
		} catch (Base e) {
			System.out.println("Base catch");
		}
//		catch (Derived d) {
//			System.out.println("KKK");
//		}

		FO f = new FO();

		FO.BAR a = f.new BAR();

		BAR s = f.new BAR();

	}

	private static void swap(int g, int b) {
		// TODO Auto-generated method stub
		int temp =g;
		g=b;
		b=temp;
		
		System.out.println("a:"+g+"-"+b);
	}

}
