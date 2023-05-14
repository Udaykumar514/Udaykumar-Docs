package com.spring.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.entity.Student;
import com.spring.restapi.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public List<Student> getFindAllStudents() {		
	List<Student> std =	studentService.findAll();		
		return std;
	}
	
	@PostMapping("/")
	public Student saveStudents(@RequestBody Student student) {		
		
		Student std = studentService.saveStudent(student);	
		return std;
	}
	
	@PutMapping("/")
	public Student updateStudents(@RequestBody Student student) {		
		
		Student std = studentService.updateStudent(student);	
		return std;
	}
	
	@PutMapping("/{id}")
	public Student updateStudentsById(@PathVariable("id") int id ,  @RequestBody Student student) {		
		
		Student std = studentService.findById(id);
		
		std.setStudentname(student.getStudentname());
		std.setCourse(student.getCourse());
		std.setFee(student.getFee());
		
		Student st1 = studentService.updateStudent(student);
		
		return st1;
	}
	
	@PatchMapping("/{id}")
	public Student patchUpdateStudentsById(@PathVariable("id") int id ,  @RequestBody Student student) {		
		
		Student std = studentService.findById(id);
		
		std.setStudentname(student.getStudentname());
		std.setCourse(student.getCourse());
		std.setFee(student.getFee());
		
		Student st1 = studentService.updateStudent(student);
		
		return st1;
	}
	
	@GetMapping("/{id}")
	public Student getEntry(@PathVariable("id") int id) {
		Student std = studentService.findById(id);	
		return std;
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteEntry(@PathVariable("id") int id) {	
		Student std = studentService.findById(id);	
		  studentService.deleteStudent(std);
		return "delete success";
	}
	
	

}
