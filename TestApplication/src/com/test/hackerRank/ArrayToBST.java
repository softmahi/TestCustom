/**
 * 
 * 
 * 

Given a sorted array. Write a program that creates a Balanced Binary Search Tree using array elements. If there are n elements in array, then floor(n/2)'th element should be chosen as root and same should be followed recursively.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,N is the size of array.
The second line of each test case contains N input A[].

Output:

Print the preorder traversal of constructed BST.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 1000
1 ≤ A[] ≤ 10000

Example:

Input:
1
7
1 2 3 4 5 6 7

Output:
4 2 1 3 6 5 7




 */
package com.test.hackerRank;

import java.util.*;
import java.lang.*;
import java.io.*;
class Node
{
    int data;
    Node left;
    Node right;
    Node(int a)
    {
        data=a;
        left=null;
        right=null;
    }
}

class ArrayToBST
 {
     static Node insert(int arr[],int l,int r)
     {
         if(l<=r)
         {
             int mid=(l+r)/2;
             
             Node root=new Node(arr[mid]);
             root.left=insert(arr,l,mid-1);
             root.right=insert(arr,mid+1,r);
             return root;
             
         }
         return null;
     }
     static void preOrder(Node root)
     {
         if(root==null)
         return ;
         System.out.print(root.data+" ");
         preOrder(root.left);
         preOrder(root.right);
     }
	public static void main (String[] args)
	 {
	     
	 //code
		
		/**
		 * 1
7
1 2 3 4 5 6 7
		 */
	 Scanner in=new Scanner(System.in);
	 int t=in.nextInt();
	 while(t--!=0)
	 {
	     int n=in.nextInt();
	     int arr[]=new int[n];
	     for(int i=0;i<n;i++)
	     arr[i]=in.nextInt();
	     
	     
	     Node root=insert(arr,0,n-1);
	     preOrder(root);
	     System.out.println();
	     
	     
	     
	 }
	 }
}