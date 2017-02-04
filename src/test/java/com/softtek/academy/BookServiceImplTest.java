package com.softtek.academy;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.softtek.academy.domain.BookEntity;
import com.softtek.academy.services.BookService;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(inheritLocations = true)
@DatabaseSetup(value = { "/dataset/default.xml" }, type = DatabaseOperation.CLEAN_INSERT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class BookServiceImplTest {
	
	@Autowired
	private BookService bookService;

	@Test
	@DatabaseSetup(value="/dataset/bookTest.xml", type=DatabaseOperation.CLEAN_INSERT)
	public void testBookServiceListNotNull(){
		List<BookEntity> bookList;
		bookList = bookService.getAllBooks();
		System.out.println(bookList);
		System.out.println(bookList.size());
		Assert.assertNotNull(bookList);
	}
	
	@Test
	@DatabaseSetup(value="/dataset/bookTest.xml", type=DatabaseOperation.CLEAN_INSERT)
	public void testBookServiceFindOneBook(){
		BookEntity testBook = new BookEntity();
		Long id = 2L ;
		testBook = bookService.getBookById(id);
		System.out.println(testBook);
		System.out.println(testBook.getName());
		Assert.assertNotNull(testBook);
	}
	

	@Test
	@DatabaseSetup(value = "/dataset/bookTest.xml", type = DatabaseOperation.CLEAN_INSERT)
	public void testBookServiceFindOneBookEqualsBook(){
		BookEntity testBook = new BookEntity(10L, "Jary", "Chuy", "UABC", "Spanish", true, 1900L);
		BookEntity book = bookService.getBookById(10L);
		Assert.assertEquals(book, testBook);
	}
	
	@Test
	@ExpectedDatabase(value = "/dataset/bookTestUpdate.xml")
	public void testBookServiceUpdateOneBook(){
		BookEntity testBook = new BookEntity();
		testBook = bookService.getBookById(2L);
		testBook.setYear(2015L);
		bookService.updateBook(testBook);	
	}
	
	
	
	
	

}
