package com.spring.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.entity.Student;
import com.spring.example.service.StudentService;

@RestController
public class HomeController {
	
	@Autowired
	public StudentService studentService;
	
	
	//post 
	@PostMapping("/post")
	public Student saveStudent(@RequestBody Student student) {
		
	return	studentService.saveStudent(student);
		
	}
	
	//get
	@GetMapping("/get/{id}")
	public Student findById(@PathVariable("id") long id ,@RequestBody Student student) {
		
		return  studentService.findById(id);
	}
	
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable("id") long id , @RequestBody Student student) {
		
		return  studentService.saveStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteByStudent(@PathVariable("id") long id) {
	
	studentService.deleteStudent(id);
	return "delete success";
	
	}
	
	
	@GetMapping("/getAll")
	List<Student> getAllStudents(){
		
	return	studentService.getAllStudentDetails();
	}

}
