package com.java.collection.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		
		return Integer.compare(std1.getId(), std2.getId());
	}
	
	
}

public class StudentCollectionRunner {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(10, "Rday"));
		students.add(new Student(2, "kiran"));
		students.add(new Student(30, "gun"));
		students.add(new Student(100, "Arun"));
		
		System.out.println(students);
		
		Collections.sort(students);
		System.out.println("Sorting Based on Id Desending comparable::" +students);
		
		Collections.sort(students, new AscendingStudentComparator());
		System.out.println("Sorting Based on Id New Ascending Comparator :: " +students);
		
	}

}
