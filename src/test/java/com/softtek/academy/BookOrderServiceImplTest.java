package com.softtek.academy;

import java.util.List;

import org.junit.Assert;
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
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.softtek.academy.domain.BookEntity;
import com.softtek.academy.domain.OrderEntity;
import com.softtek.academy.domain.BookOrderEntity;
import com.softtek.academy.domain.UserEntity;
import com.softtek.academy.services.BookOrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(inheritLocations = true)
@DatabaseSetup(value = { "/dataset/default.xml" }, type = DatabaseOperation.CLEAN_INSERT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class BookOrderServiceImplTest {
	
	@Autowired
	private BookOrderService pickBookService;

	
	@Test
	@DatabaseSetup(value="/dataset/pickBookTest.xml", type=DatabaseOperation.INSERT)
	@DatabaseTearDown(value="/dataset/pickBookTest.xml", type=DatabaseOperation.DELETE)
	public void testPickBookServiceListNotNull() {
		List<BookOrderEntity> pickList;
		pickList = pickBookService.getAllBookOrders();
		System.out.println(pickList);
		Assert.assertNotNull(pickList);
	}
	
	
	@Test
	@DatabaseSetup(value="/dataset/pickBookTest.xml", type = DatabaseOperation.INSERT)
	@DatabaseTearDown(value="/dataset/pickBookTest.xml", type=DatabaseOperation.DELETE)
	public void testPickBookServiceGetOneById(){
		BookOrderEntity pickTest = pickBookService.getBookOrderById(1L);
		UserEntity userTest = new UserEntity(4L, "Dogo", "Dogo", "Daniel","");
		OrderEntity orderTest = new OrderEntity(1L, userTest);
		BookEntity bookTest = new BookEntity(10L, "Jary", "Chuy", "UABC", "Spanish", true, 1900L); 
		BookOrderEntity pickBook = new BookOrderEntity(1L, orderTest,bookTest);
		System.out.println(pickTest);
		Assert.assertEquals(pickTest, pickBook);
	}
	
	
}
