package com.softtek.academy.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softtek.academy.domain.BookEntity;
import com.softtek.academy.services.BookService;

@RequestMapping(value = "/Book")
@Controller
public class BookController {
	
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookService bookService;

	@RequestMapping(value = "/List" , method = RequestMethod.GET)
	public String bookView() {
		return "bookList";
	}
	@RequestMapping(value = "/create" , method = RequestMethod.GET)
	public String bookAddView() {
		return "createBook";
	}
	
	
	@RequestMapping(value = "/addBook" , method = RequestMethod.POST)
	public String bookAdd(@RequestBody BookEntity book) {
		System.out.println(book);
		bookService.createBook(book);
		return "bookList";
	}
	
	
	@RequestMapping(value="/BookList", method= RequestMethod.GET)
	public ResponseEntity<?> bookList(){
		List<BookEntity> bookList = bookService.getAllBooks();
		System.err.println(bookList);
		if(bookList.isEmpty()){
			return new ResponseEntity<List<BookEntity>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<BookEntity>>(bookList, HttpStatus.OK);
		
	}
	
	
}
