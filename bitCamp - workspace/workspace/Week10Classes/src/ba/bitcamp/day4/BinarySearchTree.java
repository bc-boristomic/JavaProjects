package ba.bitcamp.day4;

public class BinarySearchTree <T extends Comparable<T>> {
	
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void add(T value) {
		if (root == null) {
			root = new Node(value);
			return;
		}
		add(root, value);
	}
	
	private void add(Node subRoot, T value) {
		if (value.compareTo(subRoot.value) <= 0) {
			if (subRoot.left == null) {
				subRoot.left = new Node(value);
				return;
			}
			add(subRoot.left, value);
		} else {
			if (subRoot.right == null) {
				subRoot.right = new Node(value);
			}
			add(subRoot.right, value);
		}
	}
	
	public void printTree() {
		printTree(root);
	}
	
	private void printTree(Node subRoot) {
		if (subRoot == null) {
			return;
		}
		printTree(subRoot.left);
		System.out.println(subRoot.value);
		printTree(subRoot.right);
	}
	
	public String toString() {
		Node subRoot = root;
		String s = "";
		if (subRoot == null) {
			return subRoot.toString();
		}
		printTree(subRoot.left);
		s += subRoot.value + "\n";
		printTree(subRoot.right);
		return s;
	}
	
	private class Node {
			
		T value;
		Node left;
		Node right;
		
		public Node(T value) {
			this.value = value;
		}
		
		public String toString() {
			return value.toString();
		}
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bin = new BinarySearchTree<>();
		bin.add(5);
		bin.add(3);
		bin.add(8);
		bin.add(6);
		//bin.printTree();
		System.out.println(bin);
	}

}
