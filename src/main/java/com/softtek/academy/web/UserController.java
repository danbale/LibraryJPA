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

import com.softtek.academy.domain.UserEntity;
import com.softtek.academy.services.UserService;

@RequestMapping(value = "/User")
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;

	@RequestMapping(value = "/List" , method = RequestMethod.GET)
	public String userView() {
		return "userList";
	}
	
	@RequestMapping(value = "/create" , method = RequestMethod.GET)
	public String userAddView() {
		return "createUser";
	}
	
	
	@RequestMapping(value = "/addUser" , method = RequestMethod.POST)
	public String userAdd(@RequestBody UserEntity user){
		System.out.println(user);
		userService.createUser(user);
		return "userList";
	}
	
	
	@RequestMapping(value="/UserList", method= RequestMethod.GET)
	public ResponseEntity<?> userList(){
		List<UserEntity> userList = userService.getAllUsers();
		if(userList.isEmpty()){
			return new ResponseEntity<List<UserEntity>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<UserEntity>>(userList, HttpStatus.OK);
		
	}
	
	
}