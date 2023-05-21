package com.spring.restapi.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.entity.Fruits;
import com.spring.restapi.service.FruitsService;

@RestController
@RequestMapping("fruits")
public class FruitsController {
	
	@Autowired
	public FruitsService fruitsService;
	
	
	@GetMapping("/")
	public List<Fruits> getAllFruits() {
		List<Fruits> f1 = fruitsService.findAllFruits();
		return f1;
	}
	
	@PostMapping("/")
	public Fruits postSaveFruits(@RequestBody Fruits fruits) {

		Fruits f1 =	fruitsService.saveFruits(fruits);
		return f1;
				
	}
	
	@PutMapping("/")
	public Fruits updateFruits(@RequestBody Fruits fruits) {

		Fruits f1 =	fruitsService.updateFruits(fruits);
		return f1;
				
	}
	
	@GetMapping("/{id}")
	public Fruits getAllFruits(@PathVariable("id") long id, Fruits fruits) {

		Fruits f1 = fruitsService.findById(id);
		return f1;
	}

	@DeleteMapping("/{id}")
	public String deleteFruits(@PathVariable("id") long id, Fruits fruits) {
	fruitsService.findById(id);
		fruitsService.deleteFruits(fruits);
		return "Fruits Delete successfully"; 
	}
	
}
