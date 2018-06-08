package com.test.performance;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LoopTestReverse {

	public static void main(String[] argv) {

		String sArray[] = createArray();

		// convert array to list
		List lList = Arrays.asList(sArray);
		int iListSize = lList.size();

		// Reverse Loop Testing
		System.out.println("\n--------- Reverse Loop --------\n");
		long lReverseStartTime = new Date().getTime();
		System.out.println("Start: " + lReverseStartTime);

		// for loop
		for (int i = iListSize - 1; i > 0; i--) {
			String stemp = (String) lList.get(i);
		}

		long lReverseEndTime = new Date().getTime();
		System.out.println("End: " + lReverseEndTime);

		long lReverseDifference = lReverseEndTime - lReverseStartTime;
		System.out.println("For - Elapsed time in milliseconds: " + lReverseDifference);

		System.out.println("\n-------END-------");

	}

	static String[] createArray() {

		String sArray[] = new String[15000000];

		for (int i = 0; i < 15000000; i++)
			sArray[i] = "Array " + i;

		return sArray;
	}

}
