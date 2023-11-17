package com.example.demo.dtos;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PostDtoV2 {
	
	private Long id;
	
	//title should not be null or empty
	//title should not  at least 2 characters
	@NotEmpty
	@Size(min = 2 , message = "title should not  at least 2 characters")
	private String title;
	

	//description should not be null or empty
	//description should not  at least 10 characters
	@NotEmpty
	@Size(min = 10 , message = "description should not  at least 10 characters")
	private String description;
	
	//content should not be null or empty
	@NotEmpty
	private String content;
	
	private Set<CommentDto> comments;
	
	
	private List<String> tags;
	

}
