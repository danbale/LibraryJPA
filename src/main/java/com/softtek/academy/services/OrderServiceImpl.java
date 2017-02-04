package com.softtek.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.softtek.academy.domain.OrderEntity;
import com.softtek.academy.repository.OrderRepository;

@Component
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;

	
	// This function get all the orders from the database
	@Override
	public List<OrderEntity> getAllOrders() {
		return orderRepository.findAll();
	}
	
	// This function get one order by the id
	@Override
	public OrderEntity getOrderById(Long id) {
		return orderRepository.findOne(id);
	}

	@Override
	public boolean deteleOrder() {
		// TODO Auto-generated method stub
		return false;
	}
}
