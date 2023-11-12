package com.example.demo.service;


import com.example.demo.dtos.PostDto;
import com.example.demo.dtos.PostResponse;

public interface PostService {

	//post
	PostDto createPost(PostDto postDto); 
	
	//getAll
	PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
//	List<PostDto> getAllposts();
	
	//getById
	PostDto getPostById(long id);
	
	//update
	PostDto updatePosts(PostDto postId, long id);
	
	//delete
	void deletePosts(long id);
	
	
}
