package com.java.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import com.java.streams.Employees;


public class StreamsExample {
	
	public static void main(String[] args) {
				
		List<Employees>  EmployeesList = new ArrayList<>();
		EmployeesList.add(new Employees(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		EmployeesList.add(new Employees(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		EmployeesList.add(new Employees(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		EmployeesList.add(new Employees(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		EmployeesList.add(new Employees(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		EmployeesList.add(new Employees(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		EmployeesList.add(new Employees(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		EmployeesList.add(new Employees(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		EmployeesList.add(new Employees(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		EmployeesList.add(new Employees(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		EmployeesList.add(new Employees(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		EmployeesList.add(new Employees(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		EmployeesList.add(new Employees(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		EmployeesList.add(new Employees(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		EmployeesList.add(new Employees(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		EmployeesList.add(new Employees(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		EmployeesList.add(new Employees(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
		//How many male and female Employeess group by count
		Map<String, Long>  s1 = EmployeesList.stream().collect(Collectors.groupingBy(Employees :: getGender, Collectors.counting()));
		System.out.println(s1);
		
		
		//To Print all Employees Names
		Map<String, Long> s2 = EmployeesList.stream().collect(Collectors.groupingBy (Employees :: getName , Collectors.counting()));
		System.out.println(s2);
		
		EmployeesList.stream().map(Employees :: getName).forEach(s->System.out.println(s));
		System.out.println("==================");
		//Print the name of all departments in the organization? 
		EmployeesList.stream().map(Employees :: getDepartment).forEach(System.out::println);
		
	//	What is the average age of male and female Employeess?	
		Map<String, Double> s3 = EmployeesList.stream().collect(Collectors.groupingBy(Employees :: getGender , Collectors.averagingInt(Employees :: getAge)));
		System.out.println(s3);
		
		// Get the details of highest paid Employees in the organization
		
		Optional<Employees> e =	EmployeesList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employees :: getSalary)));
		System.out.println(e);	
		
		Optional<Employees> s4 = EmployeesList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employees :: getSalary)));
		/*
		 * if(s4.isPresent()) { System.out.println(s4); }else {
		 * System.out.println("No there element"); }
		 */
		System.out.println(s4);
		
		System.out.println("==================");
		//Get the names of all employees who have joined after 2015?
	List<String> s15=	EmployeesList.stream().filter(s->s.getYearOfJoining() > 2015).map(Employees :: getName).sorted().collect(Collectors.toList());
	System.out.println(s15);
	System.out.println("==================");
List<Employees> s16= EmployeesList.stream().sorted((o1,o2) -> (int) (o2.getSalary() - o1.getSalary())).skip(3).collect(Collectors.toList());
		System.out.println(s16);
		
	}
	

}
