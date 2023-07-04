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

import com.microservice.example.entity.Address;
import com.microservice.example.repository.AddressRepository;

@RestController
@RequestMapping("/address-service")
public class AddressController {
	
	@Autowired
	private AddressRepository  addressRepository;
	
	@PostMapping
	private ResponseEntity<String>  saveAddress(@RequestBody Address address){
		
		addressRepository.save(address);
		
		return new ResponseEntity<> ("Address Details Saved Successfully!" , HttpStatus.CREATED);
	}
	
	
	@GetMapping
	private List<Address> getAllAddressDetails(){		
		return addressRepository.findAll();		
	}

}
