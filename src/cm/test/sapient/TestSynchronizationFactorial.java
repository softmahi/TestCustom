package cm.test.sapient;

//example of java synchronized method  
class Table {
	synchronized int factorial(int n) {
		if (n == 0)
			System.out.println("1");
		// System.out.println("Hello" );
		return n * factorial(n - 1);

	}
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.factorial(5);
	}

}

public class TestSynchronizationFactorial {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		t1.start();

	}
}