package com.spring.restapi.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCrudSpingBootRestTemplateProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudSpingBootRestTemplateProjectApplication.class, args);
	}

	//main -> controller -> service -> Repository -> Entity
}
