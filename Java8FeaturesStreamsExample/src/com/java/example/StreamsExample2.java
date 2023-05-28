package com.java.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamsExample2 {

	public static void main(String[] args) {
		
		List<Employee>  employeeList = new ArrayList<>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
	// Get the details of highest paid employee in the organization? (maxBy, Comparator , comparingDouble)
	Optional<Employee> highest =	employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee:: getSalary)));
	System.out.println(highest);
	
	Employee paid = highest.get();  //using Optional to print details
	System.out.println("Employee Id ::" + paid.getId());
	System.out.println("Employee Name ::" +paid.getName());
	System.out.println("Employee Department ::" +paid.getDepartment());		
	System.out.println("Employee Salary ::" +paid.getSalary());
	System.out.println("Employee Year of Joining ::" +paid.getYearOfJoining());
	
	System.out.println("==============================================");
	
	//Get the names of all employees who have joined after 2015?
	employeeList.stream().filter(s -> s.getYearOfJoining() > 2015).map(d -> d.getName()).forEach(s ->System.out.println("All Employees Names Joined after 2015:" +s));
	
	System.out.println("==============================================");
	
	//Count the number of employees in each department?
	Map<String, Long> emp =	employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.counting()));
	System.out.println(emp);
	
	//2nd approach using set method
	Set<Entry<String, Long>> map = emp.entrySet();
	for(Entry<String, Long> e : map) {
		System.out.println(e.getKey() + " "  + e.getValue());
	}
	System.out.println("==============================================");
	
	//What is the average salary of each department?
	Map<String, Double> emp1 =	employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.averagingDouble(Employee :: getSalary)));
	System.out.println(emp1);
	
	//2nd approach using set method
	Set<Entry<String, Double>> maps = emp1.entrySet();
	for(Entry<String, Double> e : maps) {
		System.out.println(e.getKey() + " "  + e.getValue());
	}
	System.out.println("==============================================");


	//Get the details of youngest male employee in the product development department?		
	Optional<Employee> emp4 =	employeeList.stream().filter((s)->s.getGender() == "Male" && s.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee:: getAge));		
			System.out.println(emp4);
	
	Employee emps = emp4.get(); //2nd approach using Optional method
	System.out.println("Id:" +emps.getId());
	System.out.println("Name:" +emps.getName());
	System.out.println("Age:" +emps.getAge());
	System.out.println("Gender:" +emps.getAge());
	System.out.println("Department:" +emps.getDepartment());
	System.out.println("Salary:" +emps.getSalary());	
	System.out.println("==============================================");
	
	//Get the details of youngest Female employee in the Sales And Marketing department?		
	Optional<Employee> emp5 =	employeeList.stream().filter((d)->d.getGender() == "Female" && d.getDepartment() == "Sales And Marketing")
	.min(Comparator.comparingInt(Employee :: getAge));
	System.out.println(emp5);
	Employee empss = emp4.get(); //2nd approach using Optional method
	System.out.println("Id:" +empss.getId());
	System.out.println("Name:" +empss.getName());
	System.out.println("Age:" +empss.getAge());
	System.out.println("Gender:" +empss.getAge());
	System.out.println("Department:" +empss.getDepartment());
	System.out.println("Salary:" +empss.getSalary());	
	System.out.println("==============================================");
	
	// Who has the Most working experience in the organization?	
	Optional<Employee> emp6 =	employeeList.stream().sorted(Comparator.comparingInt(Employee :: getYearOfJoining)).findFirst();
	System.out.println(emp6);
	
	Employee  working = emp6.get(); //2nd approach using Optional method
	System.out.println("========================");
	System.out.println("Senior Most working Experience Employee");
	System.out.println("========================");
	System.out.println("Id :: " + working.getId());
	System.out.println("Name :: " + working.getName());
	System.out.println("Gender :: " + working.getGender());
	System.out.println("Department :: " + working.getDepartment());
	System.out.println("Year Of Joining :: " + working.getYearOfJoining());
	System.out.println("Salary ::" +working.getSalary());
	System.out.println("==============================================");
	
	// How many male and female employees are there in the sales and marketing team?
	Map<String, Long> department = employeeList.stream().filter((d -> d.getDepartment() =="Sales And Marketing")).collect(Collectors.groupingBy(Employee:: getGender, Collectors.counting()));
	System.out.println(department);	
	System.out.println("==============================================");
	
	//What is the average salary of male and female employees?	
	Map<String, Double> avg = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender, Collectors.averagingDouble(Employee:: getSalary)));
	System.out.println(avg);
	System.out.println("==============================================");
	
	//List down the names of all employees in each department?
	Map<String, List<Employee>>	list = employeeList.stream().collect(Collectors.groupingBy(Employee:: getName));
	System.out.println(list);
	
	Set<Entry<String, List<Employee>>> listSet = list.entrySet();
	for(Entry<String, List<Employee>> a1 : listSet) {
		System.out.println("Employee Name::" +a1.getKey());		
		List<Employee> e1  = a1.getValue();
		for(Employee es : e1) {
			System.out.println("Employee name:" + es.getName());
		}			
	}
	System.out.println("==============================================");	
	
	// What is the average salary and total salary of the whole organization?
	DoubleSummaryStatistics sum = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	System.out.println("Avarage is ::" + sum.getAverage());
	System.out.println("Sum is ::" + sum.getSum());
		
		
	//Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.	
	Map<Boolean, List<Employee>> ssss = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		
	Set<Entry<Boolean, List<Employee>>> news = ssss.entrySet();
	for (Entry<Boolean, List<Employee>> e : news) {
		System.out.println("======================");

		if (e.getKey()) {
			System.out.println("Empolyee older then 25 years");
		} else {
			System.out.println("Employee younger than or equal to 25 years");
		}
		System.out.println("======================");

		List<Employee> lists = e.getValue();
		for (Employee es : lists) {
			System.out.println(es.getName());
		}
	}
		
		
	//Who is the oldest employee in the organization? What is his age and which department he belongs to?
	Optional<Employee> one = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));
	Employee ones = one.get();
	System.out.println("======================");
	System.out.println("Name ::" + ones.getName());
	System.out.println("Age ::" + ones.getAge());
	System.out.println("Department ::" + ones.getDepartment());

	System.out.println("==========================The - End==========================");	
	
	}
}
