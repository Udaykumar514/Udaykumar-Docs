package com.java.collection.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionsExamples {

	public static void main(String[] args) {
		
		//ArrayList Examples
		List<String> words = new ArrayList<>();
		words.add("cake");
		words.add("kite");
		words.add("cake");
		words.add("one");
		words.add("three");
		System.out.println("ArrayList" +words);	
		
		//LinkedList Example
		List<String> linkedListWord = new LinkedList<>();
		linkedListWord.add("like1");
		linkedListWord.add("name");
		linkedListWord.add("like1");
		linkedListWord.add("apple");
		linkedListWord.add("cake");	
		System.out.println("Linked List" + linkedListWord);
		
		//Vector Example
		List<String> vectorWords = new Vector<>();
		vectorWords.add("Apple");
		vectorWords.add("Grapes");
		vectorWords.add("Apple");
		vectorWords.add("Banana");
		System.out.println(vectorWords);
		
		
	}
}
