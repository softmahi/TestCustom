package cm.test.ncr;

import java.util.Scanner;
// Java program for an efficient solution to check if
// a given array can represent Preorder traversal of
// a Binary Search Tree
import java.util.Stack;
 
class BinarySearchTree {
 
/*	
	Technical test includes

	Core Java (7-8 questions)
	Puzzles (2-3 puzzles)
	Quant(1-2 questions)
	Time complexity (1 question)
	Hadoop/bigdata/financial (1-2 questions)
	All questions where conceptually tricky and to solve this questions you should clear your basics.You can easily eliminate the wrong options.For puzzles take a look at Top20 puzzles from geeksforgeeks.Refer head first Java and sounfoundry for Java.

	Major concepts where from

	Object class(functions in it)
	Constructor
	String,String buffer,Stringbuilder
	Serialization, Deserialization
	Inheritance
	Static block
	Wrapper class
	Operators in java
	Collections
	Exception handling
	Technical Interview would be purely based on your cv and basics of java

	Technical Interview

	Basics of Java
	Project related questions
	1-2 programming questions
	Question related to cv
	Puzzles
	Problem solving questions.
	All the best !

	2.1k Views � View Upvoters
*/
	
	
    boolean canRepresentBST(int pre[], int n) {
        // Create an empty stack
        Stack<Integer> s = new Stack<Integer>();
 
        // Initialize current root as minimum possible
        // value
        int root = Integer.MIN_VALUE;
        
        
        // Traverse given array
        for (int i = 0; i < n; i++) {
            // If we find a node who is on right side
            // and smaller than root, return false
        	System.out.println("Iteration "+i+" root->"+root +"<-Element->"+pre[i]);
            if (pre[i] < root) {
                return false;
            }
 
            // If pre[i] is in right subtree of stack top,
            // Keep removing items smaller than pre[i]
            // and make the last removed item as new
            // root.
            while (!s.empty() && s.peek() < pre[i]) {
                root = s.peek();
                System.out.println("Iteration "+i+" new root->"+root +"<->"+pre[i]);
                s.pop();
            }
 
            // At this point either stack is empty or
            // pre[i] is smaller than root, push pre[i]
            s.push(pre[i]);
            System.out.println("Element added: "+pre[i]);
        }
        return true;
    }
 
    public static void main(String args[]) {
        BinarySearchTree bst = new BinarySearchTree();
//        Scanner scanner = new Scanner(System.in);
//        int no_of_queries = scanner.nextInt();
//        for (int i = 0; i < no_of_queries; i++) {
//			
//		}
        int[] pre1 = new int[]{40, 30, 35, 80, 100};
        int n = pre1.length;
        if (bst.canRepresentBST(pre1, n) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int[] pre2 = new int[]{40, 30, 35, 20, 80, 100};
        int n1 = pre2.length;
        if (bst.canRepresentBST(pre2, n) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}