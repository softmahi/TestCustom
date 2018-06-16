package com.test.hackerRank;

public class StringSplit {

	public static void main(String[] args) {
		final int CHAR_LIMIT = 12;

		// String in = "hi samueljohnse, your uber is arriving now!";
		String in = "Hell how are you doing let me know soon";
		int numTexts = in.length() / CHAR_LIMIT;
		String[] texts = new String[numTexts + 1];
		int index = 0;
		int prevIndex = 0;

		// we declare i before the for loop so that it will be in scope after the for
		// loop
		int i = 0;

		// loop to split text into strings whose lengths are less equal to the character
		// limit
		for (; i < numTexts; i++) {

			// update index
			index = prevIndex + CHAR_LIMIT;

			/*
			 * While loop checks if the character at index is a space, if it is the program
			 * continues, if not we "step" backwards down the text until a space is found.
			 */
			while (in.charAt(index) != ' ') {
				index -= 1;

				/*
				 * We don't want to allow an infinite loop to occur from a text that needs to be
				 * split and also contains no spaces. Since we don't know the stipulations
				 * regarding that scenario, then a simple break will suffice. However it should
				 * be noted that throwing an exception would probably be the best option in that
				 * scenario.
				 */
				if (index <= 0) {
					break;
				}
			}

			// substring the text from prevIndex to index and append the "(#/#)" string
			texts[i] = in.substring(prevIndex, index) + '(' + (i + 1) + "/" + (numTexts + 1) + ')';

			// make sure to update prevIndex
			prevIndex = index;
		}

		/*
		 * Split the final part of the text after the for loop, doing so removes the
		 * need for an additional if statement inside the for loop. Also handles the
		 * case when a text is already less equal to the character limit.
		 */
		texts[i] = in.substring(prevIndex) + '(' + (i + 1) + "/" + (numTexts + 1) + ')';

		// iterate over texts and output each one
		for (String s : texts) {
			System.out.println(s.trim());
		}
	}
}
