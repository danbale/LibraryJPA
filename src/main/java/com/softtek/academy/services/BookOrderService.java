package com.softtek.academy.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.softtek.academy.domain.BookEntity;
import com.softtek.academy.domain.OrderEntity;
import com.softtek.academy.domain.BookOrderEntity;

public interface BookOrderService {
	
	@Query(value = "SELECT boe FROM BookOrderEntity boe "
			+ "JOIN BookEntity be on  be.id = boe.book"
			+ "JOIN OrderEntity oe on oe.id = boe.order"
			+ " GROUP BY boe.id")
	public List<BookOrderEntity> getAllBookOrders();
	
	public BookOrderEntity getBookOrderById(Long id);
	
	public void createBookOrder(OrderEntity order, BookEntity book);
	
	public void deleteBookOrder(Long id);

}
