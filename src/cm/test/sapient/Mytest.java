package cm.test.sapient;

public class Mytest {

	
	public static void main(String[] args) {
		
		Byte b1= new Byte((byte) 10);
		
		Byte b2 = new Byte((byte) 10);
		
		System.out.println(b1==b2);
		
		sum(10,20);
		
		
		Example t = new Example() {
			
			public void run() {
				System.out.println("foo");
			}
		};
	}

	private static void sum(long i, long j) {
		// TODO Auto-generated method stub
		System.out.println("long");
	}
	
	private static void sum(float i, float j) {
		// TODO Auto-generated method stub
		System.out.println("cloat");
	}
}


class Example extends Thread{
	public Example() {
		// TODO Auto-generated constructor stub
		System.out.println("Example");
	}
	
	public void run(String s) {
		System.out.println("baz");
		
	}
	
	public void run() {
		System.out.println("bar");
	}
}