package com.spring.example.service;

import java.util.List;

import com.spring.example.entity.Mango;

public interface MangoService {

	public List<Mango> findAllistOfMangos();
	
	public Mango findById(long id);
	
	public Mango postSaveMango(Mango mango);
	public Mango updateById(Mango mango);
	public void deleteById(long id);
	
	
	
}
