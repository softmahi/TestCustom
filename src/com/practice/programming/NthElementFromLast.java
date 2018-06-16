package com.practice.programming;

public class NthElementFromLast {
	
	
	//https://math.stackexchange.com/questions/977063/exactly-k-consecutive-heads-n-tosses
	public class Node {
		Node next;
		int data;

		public Node(int k) {

			next = null;
			data = k;
		}

	}

	Node head;

	public static void main(String[] args) {
		NthElementFromLast elementFromLast = new NthElementFromLast();

		for (int i = 5; i > 0; i--) {
			elementFromLast.push(i);
			elementFromLast.print();
		}
		

		elementFromLast.printNthFromLast(1);

	}

	private void print() {
		// TODO Auto-generated method stub
		Node temp = head;
			while(temp!=null )
			{
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println("NULL");
	
	}

	private void push(int new_data) {
		Node new_node= new Node(new_data);
		
		new_node.next= head;
		head=new_node;
		
		

	}

	/* Function to get the nth node from end of list */
	void printNthFromLast(int n) {
		Node main_ptr = head;
		Node ref_ptr = head;
		System.out.println("head:" + head.data);
		int count = 0;
		if (head != null) {
			while (count < n) {
				if (ref_ptr == null) {
					System.out.println(n + " is greater than the no " + " of nodes in the list");
					return;
				}
				ref_ptr = ref_ptr.next;
				System.out.println("In while loop" + ref_ptr.data);
				count++;
			}
			while (ref_ptr != null) {
				main_ptr = main_ptr.next;
				System.out.println("in ref while loop main ptr:" + main_ptr.data);
				ref_ptr = ref_ptr.next;
				// System.out.println("in ref while loop ref ptr:"+ref_ptr.data);
			}
			System.out.println("Node no. " + n + " from last is " + main_ptr.data);
		}
	}

}
