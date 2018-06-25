package com.test.jpmc;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestJPMC2 {
	// adjacent digits odd or even

	public static void main(String[] args) {
		BufferedInputStream bf = new BufferedInputStream(System.in);
		try {

			BufferedReader bfread = new BufferedReader(new InputStreamReader(bf));
			String result = checkNumberDigits(bfread.readLine().toString());
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String checkNumberDigits(String number) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < number.length(); i++) {

			int current = Character.getNumericValue(number.charAt(i));

			if (i == 0) {
				sb.append(number.charAt(i));
			}

			if (i == number.length() - 1) {

				break;
			}

			int next = Character.getNumericValue(number.charAt(i + 1));

			if ((current != 0 && current % 2 == 0) && (next % 2 == 0 && next != 0)) {
				sb.append("*").append(next);
			} else if ((current != 0 && current % 2 == 1) && (next != 0 && next % 2 == 1)) {
				sb.append("-").append(next);
			} else {
				sb.append(next);
			}

		}

		return sb.toString();

	}

}
