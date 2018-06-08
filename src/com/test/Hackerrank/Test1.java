package com.test.Hackerrank;

public class Test1 {

	public static void main(String[] args) {
		
		
		double d =10.0/-0;
		// TODO Auto-generated method stub
		
//		int arr[];
//		
//		int a;
//		
//		boolean check summation
//		
//		
//		
//		a= sum();
//		y=x2;
//		
		
		
		
//			1,1,2
			
		if (d == Double.POSITIVE_INFINITY) {
			System.out.println("+infinity");
		} else {
			System.out.println("-ve infinity");
		}
		
			int i[] = {1};
			Test1 t = new Test1();
			System.out.println("1."+i.length);
			t.Increment(i);
			System.out.println("3."+i.length);
			System.out.println(i[i.length-1]);
			
		
	}

	private void Increment(int[] i) {
		// TODO Auto-generated method stub
		i[i.length-1]++;
		System.out.println("2."+i.length);
	}

}
