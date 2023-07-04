package com.microservice.example.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.microservice.example.entity.Address;

@Component
public class AddressClient {
	
	@Autowired
	private RestTemplate  restTemplate;
	
	public void saveAddress(List<Address> address ,  long empId) {
		
		address.stream().forEach(add ->{
			
			//setEmpId
			add.setEmpId(empId);
			
			//HttpHeaders
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			
			//HttpEntity
			HttpEntity<Address> httpEntity =  new HttpEntity<Address>(add, httpHeaders);
			restTemplate.exchange("http://localhost:5050/address-service", HttpMethod.POST , httpEntity, String.class);
			
			
		});
		
		
	}

}
