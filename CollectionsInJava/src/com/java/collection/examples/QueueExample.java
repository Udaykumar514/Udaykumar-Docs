package com.java.collection.examples;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
	//	queue.poll();
		queue.offer("Apple");
		queue.offer("Cat");
		queue.offer("Zebra");
		queue.offer("Monkey");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
		
	}

}
