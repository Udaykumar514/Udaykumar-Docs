package com.example.demo.service;

import java.util.List;

import com.example.demo.dtos.CommentDto;

public interface CommentService {
	
	//post -> http://localhost:8080/api/posts/9/comments
	CommentDto createPostComment(long postId, CommentDto commentDto);
	
	//getAllComments
	List<CommentDto> getAllComments(long postId);
	
	//getCommentsById
	CommentDto getCommentsById(long postId, long commentId);
	
	//update comments by Id
	CommentDto updateCommentsById(long postId, long commentId, CommentDto commentDto);
	
	//delete comments by id
	void deleteById(long postId, long commentId);
}
