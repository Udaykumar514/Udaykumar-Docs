package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UdayBlogRestApiPractice1Application {
	
	@Bean
	public ModelMapper getModelMapper() {
		
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(UdayBlogRestApiPractice1Application.class, args);
	}

}
