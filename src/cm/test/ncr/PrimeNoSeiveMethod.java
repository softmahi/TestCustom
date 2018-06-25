package cm.test.ncr;

public class PrimeNoSeiveMethod {

	/**
	 * Of course the exists a plethora of much more efficient algorithms that do the
	 * job. The most famous of which is the Eratosthenes's Seive
	 * 
	 * 
	 * 
	 * This algorithm removes from the sieve all the composite numbers and leaves
	 * out the primes. For example it removes all the multiples of 2, all the
	 * multiples of 3, all the multiples of 4 e.t.c. That's the logic of it.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int Max = 100;

		boolean isPrime[] = new boolean[Max + 1];

		checkPrimes(isPrime);

		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i])
				System.out.print(" " + i);
		}

	}

	private static void checkPrimes(boolean[] isPrime) {

		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		
		for (int i = 2; i < isPrime.length; i++) {
			
			if(isPrime[i]) {
				
				for (int j = 2; j*i <= isPrime.length; j++) {
					
					isPrime[i*j]=false;
				}
			}
			
		}

	}

}
