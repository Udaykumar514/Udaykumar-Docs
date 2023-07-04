package com.java.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringExample {

	public static void main(String[] args) {
		// LongestSubStringExample
		LongestSubString("java");

	}

	private static void LongestSubString(String s) {
		
		String longestSubString = null;
		int longestSubStringLength = 0;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char [] arr = s.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			char ch = arr[i];			
			
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i = map.get(ch);
				map.clear();
			}
			
			if(map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
			}
		
		}
		System.out.println("Longest Sub String::" +longestSubString);
		System.out.println("Length Sub String::" +longestSubStringLength);
	
	}

}
