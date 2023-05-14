package com.spring.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.entity.Fruits;
import com.spring.restapi.repository.FruitsRepository;

@Service
public class FruitsServiceImpl implements FruitsService {
	
	@Autowired
	private FruitsRepository fruitsRepository;

	@Override
	public List<Fruits> findAllFruits() {
		
		return fruitsRepository.findAll();
	}

	@Override
	public Fruits findById(long id) {
		
		return fruitsRepository.findById(id).get();
	}

	@Override
	public Fruits saveFruits(Fruits fruits) {
		
		return fruitsRepository.save(fruits);
	}

	@Override
	public Fruits updateFruits(Fruits fruits) {
		
		return fruitsRepository.save(fruits);
	}

	@Override
	public void deleteFruits(Fruits fruits) {
		
			fruitsRepository.delete(fruits);
	}

}
