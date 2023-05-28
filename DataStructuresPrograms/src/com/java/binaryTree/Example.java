package com.java.binaryTree;

//Binary Search Tree
class NewNode{
	char key;
	NewNode left, right;
	NewNode(char key){
		this.key = key;
	}
}


class BST{
	NewNode root;
	void insertKey(char key) {
		
	root = insertInTree(root, key);
		
	}
	
	NewNode insertInTree(NewNode root, char key){
		if(root == null) {
			root = new NewNode(key);
			return root;
		}
		if(key<root.key) {
			root.left = insertInTree(root.left, key);
		}
		else if(key > root.key) {
			root.right = insertInTree(root.right, key);
		}
		return root;
		
	}
	void preOrder(NewNode root) {
		if(root != null) {
			System.out.print(root.key + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}	
}

public class Example {
	public static void main(String[] args) {
		BST t1 = new BST();
		t1.insertKey('C');
		t1.insertKey('I');
		t1.insertKey('B');
		t1.insertKey('G');
		t1.insertKey('M');
		t1.insertKey('A');
		
		t1.preOrder(t1.root);
		
	}
}
