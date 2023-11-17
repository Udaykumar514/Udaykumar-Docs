package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.PostDto;
import com.example.demo.dtos.PostDtoV2;
import com.example.demo.dtos.PostResponse;
import com.example.demo.service.PostService;

@RestController
//@RequestMapping
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@PreAuthorize("hasRole('ADMIN')")	
	@PostMapping("/api/v1/posts")
	public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto){
		
		return new ResponseEntity<PostDto>(postService.createPost(postDto) , HttpStatus.CREATED);
	}
	
	@GetMapping("/api/v1/posts")
	public PostResponse getAllposts(@RequestParam(value = "pageNo" , defaultValue = "0" , required = false) int pageNo, 
		         @RequestParam(value = "pageSize" , defaultValue = "10", required = false)	int pageSize, 
			     @RequestParam(value ="sortBy" , defaultValue = "id" , required = false) String sortBy, 
			     @RequestParam(value = "sortDir" , defaultValue = "asc" , required = false)	String sortDir) {
		
		return postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
	}
 
/*	@GetMapping
	public List<PostDto> geetAllPosts(){
		
		return postService.getAllposts();
	}
	*/
	
	@GetMapping("/api/v1/posts/{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable("id") long id){
		
		return new ResponseEntity<PostDto>(postService.getPostById(id) , HttpStatus.OK);
	}
	
	@GetMapping("/api/v2/posts/{id}")
	public ResponseEntity<PostDtoV2> getPostByIdV2(@PathVariable("id") long id){
		
		PostDto postDto = postService.getPostById(id);
		PostDtoV2 postDtoV2 = new PostDtoV2();
		postDtoV2.setId(postDto.getId());
		postDtoV2.setTitle(postDto.getTitle());
		postDtoV2.setDescription(postDtoV2.getDescription());
		postDtoV2.setContent(postDto.getContent());
		
		List<String> tags = new ArrayList<>();
		tags.add("JAVA");
		tags.add("Spring Boot");
		tags.add("AWS");
		postDtoV2.setTags(tags);
		
		return ResponseEntity.ok(postDtoV2);
		
	}
	
	@PreAuthorize("hasRole('ADMIN')")		
	@PutMapping("/api/v1/posts/{id}")
	public ResponseEntity<PostDto> updatedPosts(@Valid @RequestBody PostDto postDto , @PathVariable("id") long id){
		
		return new ResponseEntity<PostDto>(postService.updatePosts(postDto, id) , HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")	
	@DeleteMapping("/api/v1/posts/{id}")
	public ResponseEntity<String> deleteByPost(@PathVariable("id") long id){
		 postService.deletePosts(id);		
		return new ResponseEntity<String> ("Deleted successufully!" , HttpStatus.OK);
	}
}
