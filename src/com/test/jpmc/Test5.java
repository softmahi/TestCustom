package com.test.jpmc;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		
		int a[] = {1234,3242,4534,1312,1111,7867};
		
		Arrays.sort(a);
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
        	System.out.println(a[i]);
		}
        
        int index = a.length-2;
        
        System.out.println(a[index]);

	}

}
