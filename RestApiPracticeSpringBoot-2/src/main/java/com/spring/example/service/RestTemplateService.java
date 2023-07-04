package com.spring.example.service;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.spring.example.entity.Student;

@Service
public class RestTemplateService {

	RestTemplate restTemplate = new RestTemplate();
	
	private static final String get_All_employeersUrl = "http://localhost:9190/getAll";
	private static final String save_employeersUrl = "http://localhost:9190/save";
	
	
	//Method to get all employee
	public ResponseEntity<String> getAllEmployees()
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	//	headers.add("Authorization", get_All_employeersUrl);
		
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		ResponseEntity<String> response = restTemplate.exchange(get_All_employeersUrl, HttpMethod.GET, entity, String.class);
		
		return response;		
	}
	
	
	//post 
	public ResponseEntity<Student>  saveEmployee(Student employee){
		
		return restTemplate.postForEntity(save_employeersUrl, employee, Student.class);
	}
	
	
	
	
	
	
	
	
	
}
