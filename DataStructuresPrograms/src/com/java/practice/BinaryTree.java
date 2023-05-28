package com.java.practice;

class Node{
	char key;
	Node left, right;
	Node(char key){
		this.key = key;
	}
}

class BST{
	Node root;
	void preorder(Node n) {
		if(n !=null) {
			System.out.print(n.key + " ");
			preorder(n.left);
			preorder(n.right);
		}
		
	}
	
	void inOrder(Node n) {
		if(n !=null) {
			inOrder(n.left);
			System.out.print(n.key + " ");
			inOrder(n.right);
		}
	}
	
	void postOrder(Node n) {
		if(n != null) {
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.key + " ");
		}
	}
}

public class BinaryTree {

	public static void main(String[] args) {
	BST t1 = new BST();
	t1.root = new Node('U');
	t1.root.left = new Node('A');
	t1.root.right = new Node('B');
	t1.root.left.left = new Node('C');
	t1.root.right.right = new Node('D');
	t1.preorder(t1.root);
	System.out.println();
	t1.inOrder(t1.root);
	System.out.println();
	t1.postOrder(t1.root);
		

	}

}
