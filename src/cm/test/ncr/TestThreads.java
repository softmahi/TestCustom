package cm.test.ncr;

import java.util.HashMap;
import java.util.Iterator;

import javax.net.ssl.SSLEngineResult.HandshakeStatus;

public class TestThreads  {
	public static void main(String[] args) {
		
		HashMap kk = new HashMap();
//		kk.put(1, null);
//		kk.put(2, null);
//		kk.put(null, null);
//		kk.put(null, 1);
//		if(!kk.isEmpty() && kk.size()>0) {
//			for (int i = 0; i < kk.size(); i++) {
//				System.out.println(kk.get(i));
//				
//			}
//		}
//	
//		
		Thread t = new MyThread(){
			public void run() {
				System.out.println("Foo");
			}
			
			
			
		};
		t.start();
	}
	
	class Mythread extends Thread {
		public Mythread() {
			System.out.println("Mythread");
		}
		public void run() {
			System.out.println("bar");
		}
		public void run(String s) {
			System.out.println("baz");
		}
		
	}

}
