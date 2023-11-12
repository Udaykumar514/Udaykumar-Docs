package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@ResponseStatus(value =  HttpStatus.NOT_FOUND)

@Getter
@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException{
	
	private String resourceName;
	private String fieldName;
	private long fieldValue;
	
	
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("Respource/page is not found %s" , resourceName, fieldName , fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	
	
	

}
