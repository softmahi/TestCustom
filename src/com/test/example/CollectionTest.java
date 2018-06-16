package com.test.example;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CollectionTest {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayList<int[]> li = pythagoreanTripplets(input);
		for (int[] is : li) {
			for (int i = 0; i < is.length; i++) {
				System.out.println(is[i]);
			}
		}
		

	}

	public static ArrayList<int[]> pythagoreanTripplets(int[] input) {
		ArrayList<int[]> answers = new ArrayList<int[]>();
		Map<Long, Integer> map = new HashMap<Long, Integer>();

		for (int i = 0; i < input.length; i++) {
			map.put((long) input[i] * (long) input[i], input[i]);
		}

		Long[] unique = (Long[]) map.keySet().toArray(new Long[0]);
		Arrays.sort(unique);
		long comps = 0;
		for (int i = 1; i < unique.length; i++) {
			Long halfC = unique[i] / 2;
			for (int j = i - 1; j >= 0; j--) {

				if (unique[j] < halfC)
					break;
				if (map.containsKey(unique[i] - unique[j])) {
					answers.add(new int[] { map.get(unique[i] - unique[j]), map.get(unique[j]), map.get(unique[i]) });
				}
			}
		}
		return answers;
	}

}
