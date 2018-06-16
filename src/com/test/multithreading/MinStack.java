package com.test.multithreading;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

	public class Node {

		int data;
		int min;
		int max;

		public Node(int data) {
			this.data = data;
		}

		public Node() {
			super();
		}

	}

	List<Node> items;

	public static void main(String[] args) {
		MinStack s = new MinStack();
		s.push(5);
		s.push(15);
		s.push(2);
		s.getMin();
		s.push(3);
		s.pop();
		s.pop();
		s.push(0);
		s.getMin();
		s.push(-1);

	}

	private  void getMin() {
		if(items!=null && !items.isEmpty() && items.size()>0) {
			System.out.println("Min::"+items.get(items.size()-1).min);
		}
	}

	private Node pop() {
		Node popThis = null;
		if (items != null && items.size() > 0) {
			popThis = this.items.get(items.size() - 1);
			items.remove(items.size() - 1);
			// System.out.println("Popped > " + popThis.data);
		}
		printStack();
		return popThis;

	}

	private void push(int data) {
		if (items == null) {
			items = new ArrayList<>();
		}

		Node item = new Node(data);

		if (items.size() > 0) {
			item.min = Math.min((items.get(items.size() - 1).min), data);
			item.max = Math.max(items.get(items.size() - 1).max, data);
		} else {
			item.min = data;
			item.max = data;

		}
		items.add(item);

		printStack();
	}

	private void printStack() {

		int i = 0;
		for (Node n : items) {
			System.out.print(n.data + " > ");
			if (i == items.size() - 1) {
				System.out.print(" | Min = " + n.min + " |");
				System.out.print(" | Max = " + n.max + " |");

			}
			i++;
		}
		System.out.println();

	}

}