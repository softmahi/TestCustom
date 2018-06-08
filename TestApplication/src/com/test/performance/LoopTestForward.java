package com.test.performance;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LoopTestForward {

	/**
	 * 
	 * 
	 * 
	 * https://www.mkyong.com/java/reverse-loop-versus-forward-loop-in-performance-java/
	 * @param argv
	 */
	public static void main(String[] argv) {

		String sArray[] = createArray();
		
		
//		/java.util
		
		//    return Arrays.stream(args).min().getAsInt();

		// convert array to list
		List lList = Arrays.asList(sArray);
		int iListSize = lList.size();
		
		
		//500 records
		
		
		

		// Forward Loop Testing
		System.out.println("\n--------- Forward Loop --------\n");
		long lForwardStartTime = new Date().getTime();
		System.out.println("Start: " + lForwardStartTime);

		// for loop
		for (int i = 0; i < iListSize; i++) {
			String stemp = (String) lList.get(i);
		}

		long lForwardEndTime = new Date().getTime();
		System.out.println("End: " + lForwardEndTime);

		long lForwardDifference = lForwardEndTime - lForwardStartTime;
		System.out.println("Forward Looping - Elapsed time in milliseconds: " + lForwardDifference);

		System.out.println("\n-------END-------");

	}

	static String[] createArray() {

		String sArray[] = new String[15000000];

		for (int i = 0; i < 15000000; i++)
			sArray[i] = "Array " + i;

		return sArray;
	}

}
