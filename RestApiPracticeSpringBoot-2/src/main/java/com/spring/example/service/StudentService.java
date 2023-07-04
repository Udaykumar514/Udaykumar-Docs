package com.spring.example.service;

import java.util.List;

import com.spring.example.entity.Student;

public interface StudentService {

	public  Student saveStudent(Student student);
	public  Student updateStudent(Student student);
	public  void  deleteStudent(long id);
	 
	 public Student findById(long id);
	 List<Student>  getAllStudentDetails();
	 
	 
	
}
