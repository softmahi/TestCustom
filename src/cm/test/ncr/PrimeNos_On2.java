package cm.test.ncr;

public class PrimeNos_On2 {
	/**
	 * 
	 * 
	 * 
	 * A positive integer p > 1 is a prime if and only if its positive divisors are
	 * only itself and 1. For example, 5,13,17,19,23 and so on.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 2; i < 70; i++)
			if (PrimeNos_On2.primeTest(i)) {
				System.out.print(" "+i);
			}
		System.out.println();
		System.out.println("With sqrt Example");
		
		for (int i = 2; i < 70; i++)
			if (PrimeNos_On2.primeTestSqrt(i)) {
				System.out.print(" "+i);
			}
		
	}
		
	
	
	
	

	public static boolean primeTest(long n) {
		for (long i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public static boolean primeTestSqrt(long n) {
		for (long i = 2; i < Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
