package cm.test.sapient;

import java.io.IOException;
import java.util.List;

public class TestReturn {
	public static void main(String[] args) {
		TestReturn t = new TestReturn();
		int i = t.check();
		System.out.println(i);
	}
	
	public static <E> void append (List<E> list) {
	}

	private int check() {

		try {
//			System.out.println("try block");
//			System.exit(0);
//			return 1;
			
			throw new IOException();

		} catch (Exception e) {
			System.out.println("Catch Block");
			return 2;
		}finally {
			
			System.out.println("finally Returning");
			return 3;
		}
		
	}

}
