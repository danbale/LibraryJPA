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

import com.softtek.academy.domain.BookOrderEntity;
import com.softtek.academy.domain.OrderEntity;
import com.softtek.academy.services.BookOrderService;

@RequestMapping(value = "/BookOrder")
@Controller
public class BookOrderController {
	
private static final Logger logger = LoggerFactory.getLogger(BookOrderController.class);
	
	@Autowired
	BookOrderService bookOrderService;

	@RequestMapping(value = "/List" , method = RequestMethod.GET)
	public String bookOrderListView() {
		return "bookOrderList";
	}
	
	@RequestMapping(value = "/create" , method = RequestMethod.GET)
	public String bookOrderAddView() {
		return "createBookOrder";
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.GET)
	public String bookOrderUpdateView() {
		return "createBookOrder";
	}
	
	
	
	
	@RequestMapping(value="/BookOrderList", method= RequestMethod.GET)
	public ResponseEntity<?> bookOrderList(){
		logger.info("si entro");
		List<BookOrderEntity> bookOrderList = bookOrderService.getAllBookOrders();
		System.err.println(bookOrderList);
		if(bookOrderList.isEmpty()){
			return new ResponseEntity<List<OrderEntity>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<BookOrderEntity>>(bookOrderList, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/addBookOrder" , method = RequestMethod.POST)
	public String pickBookAdd(@RequestBody BookOrderEntity bookOrder) {
		System.out.println(bookOrder);
		bookOrderService.createBookOrder(bookOrder.getOrder(), bookOrder.getBook());
		return "bookOrderList";
	}
	
}
