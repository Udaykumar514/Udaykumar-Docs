package com.example.demo.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CommentDto {

	private long id;
	
	
	//name should not be null or empty
	@NotEmpty(message = "name should not be null or empty")
	private String name;
	
	//email should not be null or empty
	//email field validation
	@NotEmpty(message = "email should not be null or empty")
	@Email
	private String email;
	
	// body should not be null or empty
	//body must be minimum 10 characters
	@NotEmpty
	@Size(min = 10 , message = "body must be minimum 10 characters")
	private String body;
	
}
