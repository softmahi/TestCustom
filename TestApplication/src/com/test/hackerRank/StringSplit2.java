package com.test.hackerRank;

import java.util.Arrays;
import java.util.List;

public class StringSplit2 {

	
	public static void main(String[] args) {
		String str = "Hell how are you doing let me know soon";
		String strarr[] = str.split(" ");
		int s =12;
		String strarr1[] ;
		int u=0;
		int count=0;
		String k = "" ;
		List<String> m = Arrays.asList(strarr);
		for (int i = 0; i < strarr.length; i++) {
			u = u+strarr[i].length();
			
			if(u<s) {
				k = k+" "+strarr[i];
				System.out.println(k);
			}else {
				count++;
				u=strarr[i].length();
				k=strarr[i];
			}
			
		}
		System.out.println("Count:"+count);
//		m.forEach(w-> {
//			while(w.length()<=s) {
//				strarr1[u]=w;
//			}
//		});
//		
	}
}
