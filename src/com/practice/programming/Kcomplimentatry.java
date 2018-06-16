package com.practice.programming;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Kcomplimentatry {

	public static void main(String args[]) {

		int[] arr = { 4, 4, 4, 5, 5, 5 };
		int k = solution(arr, 9);
		System.out.println(k);

		System.out.println("Next Solution:" + solution(arr, 9));
	}

	private static int solution(int[] arr, int k) {

		Map<Integer, Integer> map = new TreeMap<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int countValue = arr[i];
			int tempValue = map.containsKey(countValue) ? map.get(countValue) : 0;
			map.put(countValue, tempValue + 1);
		}

		Integer nos[] = map.keySet().toArray(new Integer[0]);

		int l = 0;
		int r = nos.length - 1;
		while (l <= r) {
			System.out.println("l:" + l + "<-" + r);
			if (nos[l] + nos[(int) r] == k) {
				// map.forEach((x, y) -> System.out.println(x + "-" + y));
				int a = map.get(nos[l]);
				System.out.println(a);
				int b = map.get(nos[r]);
				System.out.println(a);
				count += count + ((l != r) ? 2 * a * b : a * b);
				l++;
			} else if (nos[(int) l] + nos[(int) r] < k) {
				l++;
				r--;
			} else {
				r--;
			}
		}

		// TODO Auto-generated method stub
		return count;
	}

	public static int solution1(int k, int[] A) {
		Map<Long, Integer> C = new HashMap<Long, Integer>();
		for (int i = 0; i < A.length; i++) {
			final long complValue = ((long) k) - A[i];
			final int tempValue = C.containsKey(complValue) ? C.get(complValue) : 0;
			C.put(complValue, tempValue + 1);
		}

		int counter = 0;
		for (int i = 0; i < A.length; i++) {
			final long value = A[i];
			counter += C.containsKey(value) ? C.get(value) : 0;
		}

		return counter;
	}
}
