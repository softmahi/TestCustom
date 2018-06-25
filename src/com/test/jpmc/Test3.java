package com.test.jpmc;

public class Test3 {

	public static void main(String[] args) {

		try {
			try {

				//int x = div(10);
				String s = null;
				s.charAt(-1);
				
				int num[] = {1, 2, 3, 4};
			      System.out.println(num[5]);
			} catch (ArithmeticException e) {
				//
				System.out.println("in Innner catch");
				
			} finally {
				System.out.println("In Inner finally");
				return;
			}
		} catch (Exception e) {
			System.out.println("In outer catch");
		}finally {
			System.out.println("In outer finally");
		}
	}

	private static int div(int i) {
		// TODO Auto-generated method stub
		return i / 0;
	}

}
