package com.test.example;

import java.util.ArrayList;

public class PythagoreanTrippletsO_n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {10,9,8,7,6,5,4,3,2,1};
		
		ArrayList<int[]> trippleArray = isTriplet(arr,arr.length);
			for (int[] is : trippleArray) {
				for (int i = 0; i < is.length; i++) {
					System.out.print(is[i]);
				}
				System.out.println();
			}
		
	}

	private static ArrayList<int[]> isTriplet(int[] arr, int length) {
		ArrayList<int[]> answers = new ArrayList<int[]>();
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < i+1; j++) {
				
				for (int j2 = 0; j2 < j+1; j2++) {
					
					int x = arr[i]*arr[i];
					int y = arr[j]*arr[j];
					int z = arr[j2]*arr[j2];
					
					if((x+y==z) || x==(y+z) || y==(z+x)) {
						//System.out.println(x+"--"+y+"--"+z);
						answers.add(new int[] {arr[i],arr[j],arr[j2]});
					}
					
					
					
					
				}
				
			}
			
		}
		
		// TODO Auto-generated method stub
		return answers;
	}

}
