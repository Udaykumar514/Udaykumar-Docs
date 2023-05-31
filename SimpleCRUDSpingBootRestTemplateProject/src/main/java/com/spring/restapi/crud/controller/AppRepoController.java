package com.spring.restapi.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.crud.entity.User;
import com.spring.restapi.crud.service.AppRepoService;

@RestController
public class AppRepoController {
	
	@Autowired
	AppRepoService appRepoService;
	
	//CREATE
	@PostMapping("/post")
	public Object saveUser(@RequestBody User user) {
		
		return appRepoService.saveEntity(user);
	}
	
	//RETRIVE
	@GetMapping("/get/{id}")
	public 	Object getUserById(@PathVariable("id") int id) {
		
		return appRepoService.getById(id);
	}
	
	@GetMapping("/get")
	public 	Object getUserByAll(User user) {
		
		return appRepoService.getByUserAll(user);
	}
	
	//DELETE
	@DeleteMapping("/delete/{id}")
	public Object deleteUserById(@PathVariable("id") int id) {		
		appRepoService.deleteById(id);		
		return "Record Delete Success!";
	}
	
	//UPDATE
	@PutMapping("/update/{id}")
	public Object updateUserById(@PathVariable("id") int id , @RequestBody User updateUser) {
		
		return appRepoService.updateById(id, updateUser);
	
	}

}
