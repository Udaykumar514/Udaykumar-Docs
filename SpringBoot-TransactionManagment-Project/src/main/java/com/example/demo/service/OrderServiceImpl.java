package com.example.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.OrderRequest;
import com.example.demo.dto.OrderResponse;
import com.example.demo.entity.Order;
import com.example.demo.entity.Payment;
import com.example.demo.exception.PaymentException;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.PaymentRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	@Transactional
	public OrderResponse placeOrder(OrderRequest orderRequest) {
		
		Order order = orderRequest.getOrder();
		order.setStatus("IN PROGRESS");
		order.setOrderTrackingNumber(UUID.randomUUID().toString());
		orderRepository.save(order);
		
		
		Payment payment = orderRequest.getPayment();
		
		if(!payment.getType().equals("DEBIT")) {
			
			throw new PaymentException("Payment card Type do not Supported!");
		}
		
		payment.setOrderId(order.getId());	
		paymentRepository.save(payment);
		
		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setOrderTrackingNumber(order.getOrderTrackingNumber());
		orderResponse.setStatus(order.getStatus());
		orderResponse.setMessage("SUCCESS");
		return orderResponse;
	}

}
