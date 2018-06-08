package com.test.Java1_8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = Arrays.asList("mahesh","GANESH","Ramesh","Shankar");
		
		name.forEach(System.out::println);
	}

}
