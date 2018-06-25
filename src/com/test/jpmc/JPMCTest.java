package com.test.jpmc;

import java.util.*;

public class JPMCTest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String line = s.nextLine();

		String wordArray[] = line.split(",");

		String word1 = wordArray[0];

		String word2 = wordArray[1];

		String result = checkSuffixMatch(word1, word2);
		System.out.println(result);

	}

	private static String checkSuffixMatch(String word1, String word2) {

		StringBuilder result = new StringBuilder();
		for (int i = word1.length() - 1; i >= 0; i--) {
			if (word1.charAt(i) == word2.charAt(i)) {
				// System.out.println("Equal Character:::->"+word1.charAt(i)+" 2nd
				// letter->"+word2.charAt(i));
				result.append(word1.charAt(i));
			} else {
				System.out.println("Inside break");
				break;
			}
		}
		if (!result.toString().isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (int i = result.length() - 1; i >= 0; i--) {
				sb.append(result.charAt(i));
			}
			result = sb;
		} else {
			result.append("NULL".toString());
		}

		return result.toString();
	}

}
