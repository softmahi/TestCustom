package cm.test.sapient;

public class TestThread1 {
	
	public static void main(String[] args) {
		new ThreadEx().start();
		new ThreadEx(new RunnableEx()).start();
	}

}

class ThreadEx extends Thread{
	public ThreadEx() {
		// TODO Auto-generated constructor stub
	}

	public ThreadEx(RunnableEx runnableEx) {
		// TODO Auto-generated constructor stub
		super(runnableEx);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside ThreadEx");
	}
}

class RunnableEx implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside RunnableEX");
		
	}
	
}
