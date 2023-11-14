package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.PostDto;
import com.example.demo.dtos.PostResponse;
import com.example.demo.entity.Post;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private ModelMapper mapper;
		
	@Override
	public PostDto createPost(PostDto postDto) {		
		
		//convertDTO to Entity	
		Post post = mapToEntity(postDto);
		Post newPost = postRepository.save(post);
		
		
		//convert Entity to Dto	
		PostDto postDto1 = mapToDto(newPost);
		
		return postDto1;
	}
	
	
	private Post mapToEntity(PostDto postDto) {
		
		Post post = mapper.map(postDto, Post.class);		
		return post;		
	}

	private  PostDto mapToDto(Post post) {
		
		PostDto postDto = mapper.map(post, PostDto.class);
		
		return postDto;
		
	}

/*
	@Override
	public List<PostDto> getAllposts() {
			
		List<Post> posts = postRepository.findAll();
		return posts.stream().map((post) -> mapToDto(post)).collect(Collectors.toList());
	}
*/
	
	@Override
	public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
		
		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
	
		//Creating pagable Instance
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		
		Page<Post> posts =  postRepository.findAll(pageable);
		
		//get content for page object
		List<Post> lisofPosts = posts.getContent();
		
		List<PostDto> content =  lisofPosts.stream().map((post) ->  mapToDto(post)).collect(Collectors.toList());
		
		PostResponse postResponse = new PostResponse();
		postResponse.setContent(content);
		postResponse.setPageNo(posts.getNumber());
		postResponse.setPageSize(posts.getSize());
		postResponse.setTotalElements(posts.getTotalElements());
		postResponse.setTotalPage(posts.getTotalPages());
		postResponse.setLast(posts.isLast());
		
		return postResponse;
		
	}

	@Override
	public PostDto updatePosts(PostDto postDto, long id) {
		
		Post post = postRepository.findById(id).orElseThrow(() ->  new ResourceNotFoundException("post" , "id" , id));

		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		
		Post p1 = postRepository.save(post);
		
		return mapToDto(p1);
	}


	@Override
	public void deletePosts(long id) {
		
		Post post = postRepository.findById(id).orElseThrow(() ->  new ResourceNotFoundException("post" , "id" , id));
			
		postRepository.delete(post);
		
	}


	@Override
	public PostDto getPostById(long id) {
		Post post = postRepository.findById(id).orElseThrow(() ->  new ResourceNotFoundException("post" , "id" , id));	
		return mapToDto(post);
	} 
	
}
