package com.example.demo.service;

import com.example.demo.dto.OrderRequest;
import com.example.demo.dto.OrderResponse;

public interface OrderService {
	
	OrderResponse placeOrder(OrderRequest orderRequest);

}
