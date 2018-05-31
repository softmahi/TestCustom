package cm.test.sapient;

public class Child extends Parent{
	
	static {
		System.out.println("static Child ");
	}
	public Child(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Child Constr");
	}
	
	public static void main(String[] args) {
		Parent p ;
		
	}

}

class Parent{
	 static   {
		System.out.println("Static parent");
	}
	 public Parent() {
		// TODO Auto-generated constructor stub
		 System.out.println("Const");
	}
	
}