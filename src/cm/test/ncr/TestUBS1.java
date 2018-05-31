/**
 * 
 */
package cm.test.ncr;

/**
 * @author User1
 *
 */
public class TestUBS1 {

	/**
	 * @param args
	 */

	
	static class Test extends Thread
	{
		int count= 0;
		public void run()
		{
			synchronized(this) {
				System.out.println("Run");
				for(int i=0; i<50; i++)
				{
					count =count+i;
				}
				notify();
			}
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Test a = new Test();
		
		a.start();
		System.out.println("Waiting");
		synchronized (a) {
			
			a.wait();
		}
		System.out.println(a.count);

	}

}
