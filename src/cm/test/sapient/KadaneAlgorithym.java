package cm.test.sapient;

import javax.sound.midi.Synthesizer;

public class KadaneAlgorithym {

	public static void main(String[] args) {
		//int arr[] = { -1, -2, 2, 1, -4, 6, -4, 8, -4, -3 };
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		getLargestSumContigenouSubarray(arr, arr.length);
	}

	private static void getLargestSumContigenouSubarray(int[] arr, int length) {
		
		if(-2 > -3) {
			System.out.println("Check");
		}
			

		int max_sum = arr[0];
		int curr_max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			//System.out.println(arr[i]);
			curr_max = Math.max(arr[i], curr_max+arr[i]);
			System.out.println("Curr max->"+curr_max);
			max_sum = Math.max(curr_max, max_sum);
			System.out.println(" max sum ->"+max_sum);
		}
		
		System.out.println(max_sum);

	}

}
