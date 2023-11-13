package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name" , nullable = false)
	private String name;
	@Column(name = "email" , nullable = false)
	private String email;
	@Column(name = "body" , nullable = false)
	private String body;
	
	
	
	//Imp
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id" , nullable = false)
	private Post post;
	
}
