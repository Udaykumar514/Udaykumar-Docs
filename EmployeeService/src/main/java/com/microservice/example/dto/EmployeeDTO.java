package com.microservice.example.dto;

import java.util.List;

import com.microservice.example.entity.Address;
import com.microservice.example.entity.Employee;

import lombok.Data;

@Data
public class EmployeeDTO {
	
	private Employee employee;
	private List<Address> address;

}
