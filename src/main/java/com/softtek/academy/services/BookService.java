package com.softtek.academy.services;

import java.util.List;

import com.softtek.academy.domain.BookEntity;


public interface BookService {

	public List<BookEntity> getAllBooks();

	public BookEntity getBookById(Long id);

	public boolean createBook(BookEntity book);

	public boolean updateBook(BookEntity book);

	public void deteleBook(BookEntity book);

}
