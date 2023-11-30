package com.java.collection.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
	
	public static void main(String[] args) {
		
		List<String> wordsAl = new ArrayList<>();
		wordsAl.add("Apple");
		wordsAl.add("cat");
		wordsAl.add("bat");
		
		// Print endsWith "at"
		for(String word : wordsAl) {	
			if(word.endsWith("at")) {
				System.out.println(word);
			}			
		}
		
		//Print remove value in Array list these enhanced for loop is not removed so I will choose in iterator
		for(String word : wordsAl) {
			if(word.endsWith("at")) {
				wordsAl.remove(word);
			}
		}
		
		//Iterator remove value in endsWith "at"
		Iterator<String> iterator = wordsAl.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		System.out.println(wordsAl);	
	}

}
