package com.softtek.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.softtek.academy.domain.BookEntity;
import com.softtek.academy.domain.BookOrderEntity;
import com.softtek.academy.domain.OrderEntity;
import com.softtek.academy.repository.BookOrderRepository;

@Component
public class BookOrderServiceImpl implements BookOrderService{
	
	@Autowired
	BookOrderRepository bookOrderRepository;

	@Override
	public List<BookOrderEntity> getAllBookOrders() {
		return bookOrderRepository.getAllBookOrders();
	}

	@Override
	public BookOrderEntity getBookOrderById(Long id) {
		return bookOrderRepository.findOne(id);
	}

	@Override
	public void createBookOrder(OrderEntity order, BookEntity book) {
		BookOrderEntity pickBook = new BookOrderEntity(order, book);
		bookOrderRepository.save(pickBook);
	}

	@Override
	public void deleteBookOrder(Long id) {
		bookOrderRepository.delete(bookOrderRepository.findOne(id));
	}

	
	
}
