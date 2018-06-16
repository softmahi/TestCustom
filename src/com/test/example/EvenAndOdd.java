package com.test.example;

import java.util.Scanner;

public class EvenAndOdd {
	
	//https://www.artima.com/forums/flat.jsp?forum=121&thread=369376
	
	/**
	 * Bitwise Operators :
		Bit wise operators will work on bits at a time.
		AND : 1 & 1=1
		OR :     0 | 1= 1 , 1 | 0=1 , 1| 1= 1
		XOR:   0 | 1= 1 , 1 | 0=1
		NOT : !0=1
		Take two number 2 and 3
		010 : 2
		011 : 3
		------
		010 : 2
		------
		Take two numbers 2 and 1
		010  :2
		001  :1
		-----
		000  :0
		-----
		From above example we can say that on every even number & 1 gives 0.
		So this is our logic to be implemented in our program  if "Number & 1==0" then its even number.

		Program to check number is even or odd by using "/" operator and "%" operator
	**/	
		 
		public static void main(String []args )    {
		 
		    int number;
		    Scanner in= new Scanner(System.in);
		 
		    System.out.println("Enter a number to check even or odd");
		    number=in.nextInt();
		 
		    if((number & 1)==0){
		        System.out.println(+number+" is Even number");
		    }else{
		        System.out.println(+number+" is Odd Number");
		    }
		 
		
		}


}
