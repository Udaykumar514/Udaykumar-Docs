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
@RequestMapping("/employee-service")
public class EmployeeController {
	
	@Autowired
	public EmployeeRepository employeeRepository; 
	
	@Autowired
	public AddressClient addressClient;
	
	
	@PostMapping
	public ResponseEntity<String>  saveEmployee(@RequestBody EmployeeDTO employeeDTO){
		Employee employee =	employeeRepository.save(employeeDTO.getEmployee());
		
		if(employee !=null && employee.getEmpId() > 0) {
			addressClient.saveAddress(employeeDTO.getAddress() , employee.getEmpId());
		}
		
		return new ResponseEntity<>("Employee " + employee.getEmpName() + " Details Saved Successfully with Id " +employee.getEmpId(), HttpStatus.CREATED);
		
	}
	
	
	@GetMapping
	public List<Employee>  getAllListEmployeeDetails(){
		return 	employeeRepository.findAll();
		
	}

}
