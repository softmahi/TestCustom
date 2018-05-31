package cm.test.sapient;

public class ThreadDemo implements Runnable {
	
	static Boolean A1=true;
	static Boolean A2 =true;

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1; i++) {
			if(A1) {
				System.out.println(Thread.currentThread().getName()+"is Active");
			A1=false;
			A2=true;
			}
			
			if(A2) {
				System.out.println(Thread.currentThread().getName()+"is Active");
			A2=false;
			A1=true;
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Thread t1 = new Thread(new ThreadDemo());
			t1.start();
			
			Thread t2 = new Thread(new ThreadDemo());
			t2.start();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
