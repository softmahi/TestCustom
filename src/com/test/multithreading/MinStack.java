package com.test.multithreading;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

	static List<Node> stackList;

	public static void main(String[] args) {

		MinStack m = new MinStack();

		m.push(5);
		m.push(2);
		m.push(-2);
		m.push(10);
	}

	private void push(int data) {
		Node node;
		if (stackList == null) {
			stackList = new ArrayList<Node>();

			node = new Node(data);
			node.max = data;
			node.min = data;

		} else {
			node = new Node(data);

			if (!stackList.isEmpty()) {
				int min = Math.min(stackList.get(stackList.size() - 1).min, data);
				int max = Math.max(stackList.get(stackList.size() - 1).max, data);
				node.max = max;
				node.min = min;
			}

		}
		stackList.add(node);
		print();
	}

	private void print() {
		
		if(stackList!=null  && !stackList.isEmpty()) {
			for (int i = 0; i < stackList.size(); i++) {
				
				System.out.print(stackList.get(i).data+">");
				if(i == (stackList.size()-1)) {
				System.out.print("  min::"+stackList.get(i).min+"|");	
				System.out.print("  max::"+stackList.get(i).max+"|");
				}
				
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub
		
	}

	static class Node {
		int data;
		int min;
		int max;

		public Node(int data) {
			this.data = data;
		}

	}
}