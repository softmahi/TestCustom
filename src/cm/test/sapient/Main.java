package cm.test.sapient;

public class Main {
	public Main() {
		System.out.println("foo");
	}

	public int Main(int i) {
		// TODO Auto-generated constructor stub
		return i;
	}

	public static void main(String[] args) {
		
		String x= "Ma";
		String y="hesh";
		String z ="Mahesh";
		String k = x+y;
		//System.out.println(z==k);
		
		//new Main().display(null);
		
		Main m = new Main();
		m.makeBar();
		
		int i=2;
		int a[] = {10,20,50,45,95,14};
		a[i]=a[i=i+1];
		//System.out.println(a[i]);
		
		
		
		
	}

	 private void makeBar() {
		// TODO Auto-generated method stub
		 
		 (new bar() {}).go();
		
	}

	void display(Object object) {
		// TODO Auto-generated method stub
		System.out.println("object");
	}
	
	public void display(String object) {
		// TODO Auto-generated method stub
		System.out.println("string");
	}

}


