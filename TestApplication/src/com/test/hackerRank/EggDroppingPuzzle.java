
/**
 * Suppose you have N eggs and you want to determine from which floor in a K-floor building you can drop an egg such that it doesn't break. You have to determine the minimum number of attempts you need in order find the critical floor in the worst case while using the best strategy.There are few rules given below. 

    An egg that survives a fall can be used again.
    A broken egg must be discarded.
    The effect of a fall is the same for all eggs.
    If the egg doesn't break at a certain floor, it will not break at any floor below.
    If the eggs breaks at a certain floor, it will break at any floor above.

For more description on this problem see wiki page

Input:
The first line of input is  T denoting the number of testcases.Then each of the T lines contains two positive integer N and K where 'N' is the number of eggs and 'K' is number of floor in building.

Output:
For each test case, print a single line containing one integer the minimum number of attempt you need in order find the critical floor.

Constraints:
1<=T<=30
1<=N<=10
1<=K<=50


Example:
Input:
1
2 10

Output:
4
 */
package com.test.hackerRank;

import java.util.Scanner;

public class EggDroppingPuzzle {

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int eggDrop(int n, int k) {
		int eggFloor[][] = new int[n + 1][k + 1];
		int attempts;
		int i, j, x;

		for (i = 1; i <= n; i++) {
			eggFloor[i][1] = 1;
			eggFloor[i][0] = 0;
		}

		for (j = 1; j <= k; j++)
			eggFloor[1][j] = j;

		for (i = 2; i <= n; i++) {
			for (j = 2; j <= k; j++) {
				eggFloor[i][j] = Integer.MAX_VALUE;
				for (x = 1; x <= j; x++) {
					attempts = 1 + max(eggFloor[i - 1][x - 1], eggFloor[i][j - x]);
					if (attempts < eggFloor[i][j])
						eggFloor[i][j] = attempts;
				}
			}
		}

		return eggFloor[n][k];

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a[] = new int[2];
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < 2; j++) {
				a[j] = s.nextInt();
			}
			System.out.println(eggDrop(a[0], a[1]));
		}
	}
}
