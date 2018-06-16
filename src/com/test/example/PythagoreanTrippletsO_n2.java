package com.test.example;

import java.util.ArrayList;
import java.util.Arrays;

public class PythagoreanTrippletsO_n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {1,2,3,4,5};
		
		ArrayList<int[]> trippleArray = isTriplet(arr,arr.length);
			for (int[] is : trippleArray) {
				for (int i = 0; i < is.length; i++) {
					System.out.print(is[i]+"->");
				}
				System.out.println();
			}
		
	}

	private static ArrayList<int[]> isTriplet(int[] arr, int n) {
		
		ArrayList<int[]> trippleArray = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]*arr[i];
		}
		
		Arrays.sort(arr);
		
		// Now fix one element one by one and find the other two
        // elements
        for (int i = n-1; i >= 2; i--)
        {
        	System.out.println("i->"+i);
            // To find the other two elements, start two index
            // variables from two corners of the array and move
            // them toward each other
            int l = 0; // index of the first element in arr[0..i-1]
            int r = i-1; // index of the last element in arr[0..i-1]
            while (l < r)
            {
            	System.out.println(l+"<->"+r);
            	System.out.println("SUm->"+arr[l]+"Add"+arr[r]+"Equal"+arr[i]);
                // A triplet found
                if (arr[l] + arr[r] == arr[i]) {
                System.out.println("Added");
                    trippleArray.add(new int[] {(int) Math.sqrt(arr[l]),(int) Math.sqrt(arr[r]),(int) Math.sqrt(arr[i])});
                }
                // Else either move 'l' or 'r'
                if (arr[l] + arr[r] < arr[i])
                   l++;
                else
                   r--;
            }
        }
  
     
		return trippleArray;
	}

}
