package com.softtek.academy.services;

import java.util.List;

import com.softtek.academy.domain.BookEntity;
import com.softtek.academy.domain.BookOrderEntity;
import com.softtek.academy.domain.OrderEntity;

public interface BookOrderService {
	

	public List<BookOrderEntity> getAllBookOrders();
	
	public BookOrderEntity getBookOrderById(Long id);
	
	public void createBookOrder(OrderEntity order, BookEntity book);
	
	public void deleteBookOrder(Long id);

}
