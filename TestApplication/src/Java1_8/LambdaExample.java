package Java1_8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * Lambda Expressions in Java 8
 * 
 * Lambda expressions basically express instances of functional interfaces (An
 * interface with single abstract method is called functional interface. An
 * example is java.lang.Runnable). lambda expressions implement the only
 * abstract function and therefore implement functional interfaces
 * 
 * lambda expressions are added in Java 8 and provide below functionalities.
 * 
 * Enable to treat functionality as a method argument, or code as data.
 *  A function that can be created without belonging to any class.
 *  A lambda expression can be passed around as if it was an object and executed on
 * demand.
 * 
 * 
 * we can write lambda expression to replace the anonymous inner class. 
 * lambda expression make code very neat and clean. lambda expression are very to read.
 * So, they make code more readable.
 * 
 * @author User1
 *
 */
public class LambdaExample {

	public static void main(String[] args) throws InterruptedException {

		new Thread(() -> {
			System.out.println("T3est");
		}).start();

		new Thread(() -> System.out.println("Test1")).start();

		CalculatorInterface<Integer> calculatorInterface = (val) -> (val * val);

		System.out.println(calculatorInterface.operationMethod(5));
		
		
		
		String arr[] = {"ab","ba","cd","ac"};
		
//		@SuppressWarnings("unused")
//		class StringCompare implements Comparator<String> {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		}
//		
//		Arrays.sort(arr, new StringCompare());
//		
//		for (String string : arr) {
//			System.out.println(string);
//		}
		
		
		Arrays.sort(arr, ( a, b) -> a.compareTo(b));
		
for (String string : arr) {
	System.out.println(string);
}		
		
	}

}

@FunctionalInterface
interface CalculatorInterface<A> {
	A operationMethod(A val);
}
