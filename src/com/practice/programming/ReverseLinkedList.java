/**
 * 
 */
package com.practice.programming;

/**
 * @author User1
 *
 */
public class ReverseLinkedList {

	public static class Node {

		Node next;
		int data;

		public Node(int k) {
			this.data = k;
		}

	}

	static Node head;

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		ReverseLinkedList linkedList = new ReverseLinkedList();
		linkedList.head = new Node(55);

		linkedList.head.next = new Node(20);
		linkedList.head.next.next = new Node(50);

		linkedList.head.next.next.next = new Node(78);
		linkedList.printList(head);
		head = reverseList(head);

		linkedList.printList(head);
		// TODO Auto-generated method stub

	}

	private static Node reverseList(Node head2) {

		Node previous=null;
		Node current = head2;
		Node next=null;

		while (current != null) {
			
			next= current.next;
			current.next = previous;
			previous =current;
			current = next;
		
		next = current;

		}
		head2=previous;
		// TODO Auto-generated method stub
		return head2;
	}

	private void printList(Node node) {
		// TODO Auto-generated method stub

		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.println("NULL");

	}

}
