package com.spring.example.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.entity.Mango;
import com.spring.example.service.MangoService;

@RestController
public class FruitsController {

	@Autowired
	public MangoService mangoService;
	
	@PostMapping("/save")
	public Mango saveMango(@RequestBody Mango mango) {

		return mangoService.postSaveMango(mango);
	}
	
	@PutMapping("/update/{id}")
	public Mango updateMangoId(@PathVariable("id") long id, @RequestBody Mango mango) {
		
		return mangoService.updateById(mango);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") long id, @RequestBody Mango mango) {
		
		mangoService.deleteById(id);
		String msg = "Mongo delete successfully";
		return msg;
	}
	
	@GetMapping("/get/{id}")
	public Mango findById(@PathVariable("id") long id) {
		return mangoService.findById(id);
		
	}
	
	@GetMapping("/getAll")
	public List<Mango>  findAllManogs(){
		
		return mangoService.findAllistOfMangos();
	}
	
	

	
}
