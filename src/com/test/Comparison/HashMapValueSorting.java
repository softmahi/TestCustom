package com.test.Comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapValueSorting {

	public static void main(String args[]) {

		HashMap<Integer, String> k = new HashMap<>();
		k.put(3, "three1");
		k.put(1, "One1");
		k.put(2, "two1");
		k.put(5, "five1");
		k.put(6, "six1");

		k.put(4, "four1");

		List<Map.Entry<Integer, String>> l = new ArrayList<>(k.entrySet());
		for (Map.Entry<Integer, String> m : l) {
			System.out.println(m.getKey() + "---" + m.getValue());
		}
		System.out.println("------------");

		Collections.sort(l, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

		});
		for (Map.Entry<Integer, String> m : l) {
			System.out.println(m.getKey() + "---" + m.getValue());
		}

	}

}
