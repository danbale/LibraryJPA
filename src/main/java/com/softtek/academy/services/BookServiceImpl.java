package com.softtek.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.softtek.academy.domain.BookEntity;
import com.softtek.academy.repository.BookRepository;

@Component 
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	// Get the list of all the books in the DB
	@Override
	public List<BookEntity> getAllBooks() {
		return bookRepository.findAll();
	}

	// Get a single book from the list searching it by the ID
	@Override
	public BookEntity getBookById(Long id) {
		return bookRepository.findOneBook(id);
	}


	@Override
	public boolean updateBook(BookEntity book) {
		if (this.validBook(book)) {
			bookRepository.save(book);
			return true;
		}
		return false;
	}

	@Override
	public void deteleBook(BookEntity book) {
		bookRepository.delete(book);
		
	}

	@Override
	public boolean createBook(BookEntity book) {
		if (this.validBook(book)) {
			bookRepository.save(book);
			return true;
		}
		return false;
		
	}
	
	public boolean validBook(BookEntity book){
		
		if(book.getName() == null || book.getName().isEmpty()){
			return false;}
		
		if(book.getAuthor() == null || book.getAuthor().isEmpty()){
			return false;}
		
		if (book.getEditorial() == null || book.getEditorial().isEmpty()) {
			return false;}
	
		if (book.getLanguage() == null || book.getLanguage().isEmpty()) {
			return false;
		}
		
		if (book.getYear() == null || book.getYear().compareTo(0L) == 0) {
			return false;}
		return true;
		
	}

}
