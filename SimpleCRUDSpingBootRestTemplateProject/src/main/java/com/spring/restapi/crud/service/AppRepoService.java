package com.spring.restapi.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.crud.entity.User;
import com.spring.restapi.crud.repository.AppRepoRepository;

@Service
public class AppRepoService {
	
	@Autowired
	AppRepoRepository appRepoRepository;

	public Object saveEntity(User user) {
		
		return appRepoRepository.save(user);
	}

	public Object getById(int id) {
		
		return appRepoRepository.findById(id);
	}

	public void deleteById(int id) {
		
		 appRepoRepository.deleteById(id);		
	}

	public Object updateById(int id, User updateUser) {
		
		User userData = appRepoRepository.findById(id).get();
		
		if(userData != null) {
			
			userData.setUsername(updateUser.getUsername());
			userData.setPassword(updateUser.getPassword());
			userData.setRole(updateUser.getRole());			
			return appRepoRepository.save(userData);
			
		}else {
			
			return "User Details Record is not there!";
		}
		
	}

	public Object getByUserAll(User user) {
		
		return appRepoRepository.findAll();
	}
	

}
