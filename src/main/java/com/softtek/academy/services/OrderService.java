package com.softtek.academy.services;

import java.util.List;

import com.softtek.academy.domain.OrderEntity;

public interface OrderService {
	
	public List<OrderEntity> getAllOrders();
	
	public OrderEntity getOrderById(Long id);
	
	public boolean deteleOrder();

}
