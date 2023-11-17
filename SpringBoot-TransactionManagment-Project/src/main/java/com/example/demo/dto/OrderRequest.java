package com.example.demo.dto;

import com.example.demo.entity.Order;
import com.example.demo.entity.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {

	private Order order;
	private Payment payment;
	
}
