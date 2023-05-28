package com.java.binaryTree;
//Binary Search Tree
class Nodes{
	
	char key;
	Nodes left, right;
	Nodes(char key){
		this.key = key;
	}
}

class BinarySearchImplementations{
	Nodes root;
	void insertkey(char key) {
		root = insertInTree(root, key);
	}

	Nodes insertInTree(Nodes root, char key) {
		if(root == null) {
			root = new Nodes(key);
			return root;
		}
		if(key < root.key) {
			root.left = insertInTree(root.left, key);	
		}
		else if(key > root.key) {
			root.right = insertInTree(root.right, key);
		}
		return root;

	}

	//Ro,L, R	
	void preorder(Nodes root) {
		if(root != null) {
			System.out.print(root.key + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	//L, Ro, R
	void inorder(Nodes root) {
		if(root != null) {			
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}
	
	//L, R, Ro
	void postorder(Nodes root) {
		if(root != null) {			
			postorder(root.left);		
			postorder(root.right);
			System.out.print(root.key + " ");
		}
	}
}

public class BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchImplementations t1 = new BinarySearchImplementations();
		t1.insertkey('C');
		t1.insertkey('B');
		t1.insertkey('D');
		t1.insertkey('A');
		t1.insertkey('E');
		
		 t1.preorder(t1.root);
		 System.out.println();
		 t1.inorder(t1.root);
		 System.out.println();
		 t1.postorder(t1.root);

	}

}
