package cm.test.ncr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DeleteOddFromLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
	
	
	    // Complete the deleteOdd function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteOdd(SinglyLinkedListNode head) {
    	
    	SinglyLinkedListNode buf=head;
    	SinglyLinkedListNode prev=null;

        if(buf==null)
        {
            return buf;
        }

        if(buf.next==null)
        {
            if(buf.data%2!=0)
            {
                return null;

            }
        }


        while(buf!=null)
        {
            if(buf.data%2!=0)
            { 
                if(prev==null)
                {
                    head=head.next;
                    buf=head;
                }
                else
                {
                    prev.next=buf.next;
                    buf=buf.next;
                }

            }
            else {
            prev=buf;
            buf=buf.next;
            }
        }
        return head;
		


    }
    
}



