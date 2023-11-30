package com.java.collection.examples;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		
		return Integer.compare(value2.length(), value1.length());
	}
	
}

public class QueueRunner {
		
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		
	//	List<String> values = new ArrayList<>();
		queue.add("Zebra");
		queue.add("at");
		queue.add("Monkey");
		queue.add("Cat");
				
	//	queue.addAll(values);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());	
		
	//	System.out.println(queue);
		
	}

}
