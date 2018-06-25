package cm.test.sapient;

import java.util.HashMap;

/***
 * 
 * You are playing the following Bulls and Cows game with your friend: You write
 * down a number and ask your friend to guess what the number is. Each time your
 * friend makes a guess, you provide a hint that indicates how many digits in
 * said guess match your secret number exactly in both digit and position
 * (called "bulls") and how many digits match the secret number but locate in
 * the wrong position (called "cows"). Your friend will use successive guesses
 * and hints to eventually derive the secret number.
 * 
 * 
 * 
 * 
 * @author User1
 *
 */
public class BullAndCowExample {

	public static void main(String[] args) {

		String ans = getHint("1807", "7810");

		System.out.println(ans);

	}

	public static String getHint(String secret, String guess) {
		int countBull = 0;
		int countCow = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// check bull
		for (int i = 0; i < secret.length(); i++) {
			char c1 = secret.charAt(i);
			char c2 = guess.charAt(i);

			if (c1 == c2) {
				countBull++;
			} else {
				if (map.containsKey(c1)) {
					int freq = map.get(c1);
					freq++;
					map.put(c1, freq);
				} else {
					map.put(c1, 1);
				}
			}
		}

		// check cow
		for (int i = 0; i < secret.length(); i++) {
			char c1 = secret.charAt(i);
			char c2 = guess.charAt(i);

			if (c1 != c2) {
				if (map.containsKey(c2)) {
					countCow++;
					if (map.get(c2) == 1) {
						map.remove(c2);
					} else {
						int freq = map.get(c2);
						freq--;
						map.put(c2, freq);
					}
				}
			}
		}

		return countBull + ":: BullS ::" + countCow + " :: Cow ::";
	}

}
