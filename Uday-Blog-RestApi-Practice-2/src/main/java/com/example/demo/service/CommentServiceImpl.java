package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.CommentDto;
import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.exception.BlogAPIException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.PostRepository;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private ModelMapper mapper;

	
	@Override
	public CommentDto createPostComment(long postId, CommentDto commentDto) {
		
		Comment comment = mapToEntity(commentDto);
		
		  // retrieve post entity by id
		Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post" , "id" , postId));
	
		// set post to comment entity
		comment.setPost(post);
		
		 // comment entity to DB
	    Comment commentsNew =	commentRepository.save(comment);
		
		return mapToDto(commentsNew);
	}



	private CommentDto mapToDto(Comment commentsNew) {
		
		CommentDto commentsNew1 = mapper.map(commentsNew, CommentDto.class);
		
		return commentsNew1;
	}



	private Comment mapToEntity(CommentDto commentDto) {
		
		Comment comment = mapper.map(commentDto, Comment.class);
			
		return comment;
	}



	@Override
	public List<CommentDto> getAllComments(long postId) {
		
	    List<Comment> c1 =	commentRepository.findByPostId(postId);
		
		return c1.stream().map((comment) -> mapToDto(comment)).collect(Collectors.toList());
	}



	@Override
	public CommentDto getCommentsById(long postId, long commentId) {
		
		  // retrieve post entity by id
		Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post" , "id" , postId));
		
		// retrieve comment by id
		Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment" , "id" , commentId));
		
		if(!comment.getPost().getId().equals(post.getId())) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST,  "Comments is not there in DB");
		}
		
		return mapToDto(comment);
	}



	@Override
	public CommentDto updateCommentsById(long postId, long commentId, CommentDto commentDto) {
		
		  // retrieve post entity by id
			Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post" , "id" , postId));
			
			// retrieve comment by id
			Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment" , "id" , commentId));
			
			if(!comment.getPost().getId().equals(post.getId())) {
				throw new BlogAPIException(HttpStatus.BAD_REQUEST,  "Comments is not there in DB");
			}
			
			comment.setName(commentDto.getName());
			comment.setEmail(commentDto.getEmail());
			comment.setBody(commentDto.getBody());
		
			Comment updated = commentRepository.save(comment);
		return mapToDto(updated);
	}


	@Override
	public void deleteById(long postId, long commentId) {
		
		 // retrieve post entity by id
		Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post" , "id" , postId));
		
		// retrieve comment by id
		Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment" , "id" , commentId));
		
		if(!comment.getPost().getId().equals(post.getId())) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST,  "Comments is not there in DB");
		}	
		commentRepository.delete(comment);
	}

}
