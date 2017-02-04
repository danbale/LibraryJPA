package com.softtek.academy.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.softtek.academy.domain.UserEntity;
import com.softtek.academy.domainDTO.UserEntityDTO;
import com.softtek.academy.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	
	//Find all users from the database
	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	
	//Find one user by the ID
	@Override
	public UserEntity getUserById(Long id) {
		return userRepository.findOne(id);
	}

	// Create one user on the database
	@Override
	public void createUser(UserEntity user) {
		userRepository.save(user);
	}

	@Override
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteUser(UserEntity user) {
		userRepository.delete(user);	
	}

	
	// Find one user using the username
	@Override
	public UserEntity getUserByUsername(String username) {
		try {
			return userRepository.getUserByUsername(username);
		} catch (EntityNotFoundException e) {
			return null;
		}
	}

}
