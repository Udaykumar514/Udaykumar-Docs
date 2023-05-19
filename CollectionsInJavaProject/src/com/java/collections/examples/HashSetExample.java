package com.java.collections.examples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet Example in Java
		
		HashSet<Integer> list = new HashSet<Integer>();
		System.out.println("List is Empty::" +list.isEmpty());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		System.out.println(list);
		
		list.contains(10);
		System.out.println("List is Empty::" +list.isEmpty());
		
		System.out.println("List Size is ::" +list.size());
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println("hello world::" + it.next());
		}
		
		System.out.println("Remove list is:: "+list.remove(20));
		list.add(65);
		System.out.println(list);

	}

}
