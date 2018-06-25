package com.test.serilization;

import java.util.Arrays;
import java.util.List;

public class LongestIncreaseDecreaseSubArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 1, 5, 8, 10, 9, 8, 7, 6, 5, 2, 1, 2, 3, 4, 5 };
		int start = 0, end = 1, length = 1;
		while (end < arr.length) {
			/**
			 * This is main condition which needs to checked.
			 */
			if (arr[end] < arr[end - 1]) {
				if ((end - start) + 1 > length) {
					length = (end - start) + 1;
					System.out.println(start +" "+end);
				}

			} else {
				start = end;
			}
			end++;
		}

		System.out.println("length:" + length);
	}

}
