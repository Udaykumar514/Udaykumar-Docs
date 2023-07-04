package com.microservice.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.example.client.AddressClient;
import com.microservice.example.dto.EmployeeDTO;
import com.microservice.example.entity.Employee;
import com.microservice.example.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp-service")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressClient addressClient;
	
	@PostMapping
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
		
		Employee saveEmployee = employeeRepository.save(employeeDTO.getEmployee());
		
		if(saveEmployee !=null && saveEmployee.getEmpId()>0) {			
			addressClient.saveAddress(employeeDTO.getAddress() , saveEmployee.getEmpId());			
		}		
		
		return new ResponseEntity<>("Employee "+saveEmployee.getEmpName()+" Saved Successfully with ID: " + saveEmployee.getEmpId(), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployee(){
		
		List<Employee> saveEmployee = employeeRepository.findAll();
		return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
	}
}
