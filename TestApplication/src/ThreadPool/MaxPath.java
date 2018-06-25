package ThreadPool;

/**
 * Question-1) : Find the maximun path in a binary tree?
 * 
 * 10 / \ 2 10\ | \ \ | \ -25 1 50 | | 44
 * 
 * 44+50+2+10+10
 * 
 */

public class MaxPath {

	static Node root;

	static class Node {

		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	int processT(Node node, int count) {
		int path = count;

		if (node != null) {
			while (node != null) {
				if (node.left != null) {

					node = node.left;

				} else if (node.right != null) {
					node = node.right;
				}
				path++;
			}

		}
		return path;

	}

	public static int findMaxpath(Node node, int sum) {
		if (node == null) {
			return 0;
		}
		int maxsum = 0;
		int l = findMaxpath(node.left, 0);
		int r = findMaxpath(node.right, 0);

		maxsum = Math.max(Math.max(l, r) + node.data, node.data);

		int latestSum = Math.max(Math.max(l, r) + node.data, node.data);

		sum = Math.max(sum, latestSum);

		return maxsum;
	}

	static void findMax() {

		System.out.println(findMaxpath(root, 0));

	}

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		MaxPath sol = new MaxPath();
		sol.root = new Node(10);
		// left subtree
		sol.root.left = new Node(2);
		sol.root.left.left = new Node(50);
		sol.root.left.left.left = new Node(44);
		// right subtree

		sol.root.right = new Node(10);
		sol.root.right.right = new Node(30);

		sol.root.right.right.right = new Node(32);
		sol.root.right.right.right.right = new Node(33);
		sol.findMax();
	}
}