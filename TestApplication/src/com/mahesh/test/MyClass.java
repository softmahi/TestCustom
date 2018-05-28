package com.mahesh.test;


public class MyClass

{

    public static void main(String[] args)

    {

        int[] arrA = {3, 5, 0, 1, 6, 4, 2};

        int[] arrB = {2, 6, 5, 4, 3, 1, 0};

        int[] arrC = {6, 1, 4, 0, 5, 3, 2};
        
        System.out.println((arrC = arrB));
        System.out.println((arrA = arrC)[4]);

        System.out.print(arrA[(arrC = arrB)[(arrA = arrC)[4]]]);

    }
}
    

