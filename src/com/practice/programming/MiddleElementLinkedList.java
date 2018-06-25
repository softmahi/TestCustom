package com.practice.programming;

public class MiddleElementLinkedList {

	public class Node {

		Node next;
		int data;

		public Node(int newNode) {
			this.next = null;
			this.data = newNode;
		}
	}

	static Node head;

	public static void main(String[] args) {
		MiddleElementLinkedList list = new MiddleElementLinkedList();

		for (int i = 7; i > 0; i--) {

			list.push(i);
			list.print();
		}

		list.getMiddleElement();
		list.getNthElementFromLast(4);
		head = list.reverseList(head);
		list.printHead(head);
	}

	private void printHead(Node head2) {
		// TODO Auto-generated method stub

		while (head2 != null) {
			System.out.print(head2.data + "->");
			head2 = head2.next;

		}

	}

	private Node reverseList(Node head2) {
		Node previous = null;
		Node current = head2;
		Node next = null;
		while (current != null && current.next != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;

		}
		head2 = previous;
		System.out.println("Returning here");
		return head2;
	}

	private void getNthElementFromLast(int i) {
		System.out.println("Head data ::"+head.data);
		Node main_ptr = head;
		Node second_ptr = head;
		int count = 0;
		if (head != null) {
			while (count < i) {
				second_ptr = second_ptr.next;
				count++;
			}
			while (second_ptr != null && second_ptr.next != null) {
				main_ptr = main_ptr.next;
				second_ptr = second_ptr.next;
			}
			System.out.println("Nth element:" + main_ptr.data);
		}

	}

	private void getMiddleElement() {
		Node fast_node = head;
		Node slow_node = head;
		if (head != null) {
			while (fast_node != null && fast_node.next != null) {
				fast_node = fast_node.next.next;
				slow_node = slow_node.next;

			}
			System.out.println("Middle Element:" + slow_node.data);
		}

	}

	private void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	private void push(int newNode) {
		Node new_node = new Node(newNode);
		new_node.next = head;
		head = new_node;

	}

}