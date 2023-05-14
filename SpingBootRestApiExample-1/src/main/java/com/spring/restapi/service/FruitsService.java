package com.spring.restapi.service;

import java.util.List;

import com.spring.restapi.entity.Fruits;

public interface FruitsService {
	
	public	Fruits  saveFruits(Fruits fruits);	
	public Fruits  updateFruits(Fruits fruits);	
	public void deleteFruits(Fruits fruits);
	
	public List<Fruits>  findAllFruits();
	
	public Fruits  findById(long id);
	

}
