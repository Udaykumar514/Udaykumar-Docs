package com.example.demo.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.CommentDto;
import com.example.demo.service.CommentService;


@RestController
@RequestMapping("/api/")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	//	http://localhost:8080/api/posts/9/comments  (post)
	@PostMapping("posts/{postId}/comments")
	public ResponseEntity<CommentDto> createPostComments(@PathVariable("postId") long postId, @RequestBody CommentDto commentDto){
			
		return new ResponseEntity<CommentDto>(commentService.createPostComment(postId, commentDto) , HttpStatus.CREATED);
		
	}
	
	// http://localhost:8080/api/posts/2/comments  (getAll)
	@GetMapping("posts/{postId}/comments")
	public List<CommentDto> getAllCommentsById(@PathVariable("postId") long postId){
			
		return  commentService.getAllComments(postId);
	}
	 
	
	//http://localhost:8080/api/posts/2/comments/8  (getById)
	@GetMapping("posts/{postId}/comments/{commentId}")
	public ResponseEntity<CommentDto> getCommentsPostByIdDetails(@PathVariable("postId") long postId, @PathVariable("commentId") long commentId){
		
		return new ResponseEntity<CommentDto>(commentService.getCommentsById(postId, commentId) , HttpStatus.OK);
	}
	
	//http://localhost:8080/api/posts/2/comments/7 (UpdateById)
	@PutMapping("posts/{postId}/comments/{commentId}")
	public ResponseEntity<CommentDto> updateCommentsId(@PathVariable("postId") long postId, 
			                                          @PathVariable("commentId") long commentId,
			                                          @RequestBody CommentDto commentDto){
		
		return new ResponseEntity<CommentDto>(commentService.updateCommentsById(postId, commentId, commentDto) , HttpStatus.OK);
	}
	
	
	//http://localhost:8080/api/posts/2/comments/7 (deleteById)
	@DeleteMapping("posts/{postId}/comments/{commentId}")
	public ResponseEntity<String> deleteByIdComments(@PathVariable("postId") long postId, @PathVariable("commentId") long commentId){
		
		commentService.deleteById(postId, commentId);
		
		return new ResponseEntity<String>("Comments is deleted Successfully!" , HttpStatus.OK);
	}

}
