package com.test.hackerRank;

import java.util.LinkedList;

import com.test.hackerRank.KLargestElementInArray.Foo;
//import com.test.hackerRank.KLargestElementInArray.Foo.Bar;

public class KLargestElementInArray {

	// https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/

	public static class Foo {
		/*public class Bar {
			
			
		}*/

	}

	public static void main(String[] args) {
		
		Foo f = new Foo();
		
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		
		if(a.equals(b)) {
			System.out.println("a");
		}else{
			System.out.println("b");
		}
		
		LinkedList k = new LinkedList<>();
		
		k.add("A");
		k.add("B");
		k.add("C");
		k.addFirst("D");
		System.out.println(k);
		
		int s=10; int z=1;
		if(s!=10 && s/0==0) {
			System.out.println(z);
		}else {
			System.out.println("jj:"+ ++z);
		}
		
		
		
	}

}
