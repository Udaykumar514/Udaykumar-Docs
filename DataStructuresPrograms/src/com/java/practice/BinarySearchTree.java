package com.java.practice;

class Node2{
	char key;
	Node2 left, right;
	Node2(char key){
		this.key = key;
	}
}

class BSTS{
	Node2 root;
	void insertKey(char key) {
		root = InsertInTree(root,  key);
	}
	Node2 InsertInTree(Node2 root , char key){
		if(root == null) {
			root = new Node2(key);
			return root;
		}
		if(key < root.key) {
			root.left = InsertInTree(root.left, key);
		}
		else if(key > root.key) {
			root.right = InsertInTree(root.right, key);
		}
		return root;
		
	}
	
	void preOrder(Node2 n) {
		if(n != null) {
			System.out.print(n.key+ " ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	void inOrder(Node2 n) {
		if(n !=null) {
			inOrder(n.left);
			System.out.print(n.key+ " ");
			inOrder(n.right);
		}
	}
	void postOrder(Node2 n) {
		if(n !=null) {
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.key + " ");
		}
	}
}

public class BinarySearchTree {

	public static void main(String[] args) {
		BSTS t1 = new BSTS();
		t1.insertKey('C');
		t1.insertKey('B');
		t1.insertKey('A');
		t1.insertKey('G');
		t1.insertKey('I');
		t1.insertKey('K');
		
		t1.preOrder(t1.root);
		System.out.println();
		t1.inOrder(t1.root);
		System.out.println();
		t1.postOrder(t1.root);

	}

}
