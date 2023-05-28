package com.java.binaryTree;
//Binary Tree
class Node{
	char key;
	Node left, right;
	Node(char key){
		this.key = key;
	}
}

class BinaryTree{
	Node root;
	void preOrder(Node n) {
		if(n != null) {
			System.out.print(n.key+ " ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	void inOrder(Node n) {
		if( n!=null) {
			inOrder(n.left);
			System.out.print(n.key + " ");
			inOrder(n.right);
		}
	}
	
	void postOrder(Node n) {
		if(n !=null) {
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.key + " ");
		}
	}
}

public class BinaryTreeExample {

	public static void main(String[] args) {
		BinaryTree t1 = new BinaryTree();
		t1.root = new Node('A');
		t1.root.left = new Node('B');
		t1.root.right = new Node('C');
		t1.root.left.left = new Node('D');
		t1.root.right.right = new Node('E');
		
		t1.preOrder(t1.root);
		System.out.println();
		t1.inOrder(t1.root);
		System.out.println();
		t1.postOrder(t1.root);	

	}

}
