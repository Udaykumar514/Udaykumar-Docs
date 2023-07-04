package com.spring.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.example.entity.Mango;
import com.spring.example.repository.MangoRepository;

@Service
public class MangoServiceImpl implements MangoService {

	@Autowired
	public MangoRepository mangoRepository;
	
	@Override
	public List<Mango> findAllistOfMangos() {
	
		return mangoRepository.findAll();
	}

	@Override
	public Mango findById(long id) {
		
		return mangoRepository.findById(id).get();
	}

	@Override
	public Mango postSaveMango(Mango mango) {
		
		return mangoRepository.save(mango);
	}

	@Override
	public Mango updateById(Mango mango) {
		
		return mangoRepository.save(mango);
	}

	@Override
	public void deleteById(long id) {
		
		mangoRepository.deleteById(id);

	}

}
