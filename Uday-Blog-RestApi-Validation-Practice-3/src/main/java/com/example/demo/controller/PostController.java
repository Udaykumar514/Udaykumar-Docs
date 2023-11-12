package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.example.demo.dtos.PostResponse;
import com.example.demo.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@PostMapping
	public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto){
		
		return new ResponseEntity<PostDto>(postService.createPost(postDto) , HttpStatus.CREATED);
	}
	
	@GetMapping
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
	
	@GetMapping("/{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable("id") long id){
		
		return new ResponseEntity<PostDto>(postService.getPostById(id) , HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PostDto> updatedPosts(@Valid @RequestBody PostDto postDto , @PathVariable("id") long id){
		
		return new ResponseEntity<PostDto>(postService.updatePosts(postDto, id) , HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteByPost(@PathVariable("id") long id){
		 postService.deletePosts(id);		
		return new ResponseEntity<String> ("Deleted successufully!" , HttpStatus.OK);
	}
}
