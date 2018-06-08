package com.test.Hackerrank;

public class JetExtends {

	public static void main(String[] args) {

		String temp[] = { "t1", "t2" };
		
		

		try {
			// new AirJet();

			System.out.println(divide(4, 0));
			// System.out.println("Test");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("IOException thrown in Main");
		}

	}

	private static int divide(int i, int j) {
		// TODO Auto-generated method stub

		int c = -1;

		try {
			c = i / j;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
			// e.printStackTrace(e);
		} finally {
			//System.out.println("Finally");
		}
		return c;
	}

	
}

class Test extends JetExtends{
	
	int i[] = {1};

	
}
