package com.java.collection.map.examples;

import java.util.HashMap;
import java.util.Map;

public class StringCountOcccuranceExample {
	
	public static void main(String[] args) {
		
		String str = "Hi This is the Java Learning"
				+ " Book so This is Very Usefull";
		
		Map<String , Integer> hashmap = new HashMap<>();
		
		String[] words = str.split(" ");
		
		for(String word : words) {
			
			Integer integer = hashmap.get(word);
			
			if(integer == null) {
				hashmap.put(word, 1);
			}else {
				hashmap.put(word, integer + 1);
			}		
		}
		System.out.println(hashmap);
		
	}

}
