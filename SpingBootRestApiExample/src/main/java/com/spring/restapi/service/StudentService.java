package com.spring.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.restapi.entity.Student;


public interface StudentService {
	
	
/*	public String saveStudent();
	public String updateStudent();
	public String saveStudentFindAll();
	public String saveStudentFindById();
	public void deleteStudentById(); */
	
	
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(Student student);
	public Student findById(long id);
	public List<Student>  findAll();
	
	

}
