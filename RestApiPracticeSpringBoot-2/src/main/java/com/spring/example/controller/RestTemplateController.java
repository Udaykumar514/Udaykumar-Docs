package com.spring.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.example.entity.Student;
import com.spring.example.service.RestTemplateService;

@RestController
@RequestMapping("/RestTemplate")
public class RestTemplateController {

	@Autowired
	private RestTemplateService restTemplateService;
	
	@GetMapping("/getAll")
	public ResponseEntity<String> getAllStudents(){
		
		
		return restTemplateService.getAllEmployees();
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveEmployee(@RequestBody Student student){
		
		return restTemplateService.saveEmployee(student);
	}
	
	
	
	
	
}
