package com.softtek.academy.services;

import java.util.List;

import com.softtek.academy.domain.UserEntity;

public interface UserService {

	public List<UserEntity> getAllUsers();

	public UserEntity getUserById(Long id);
	
	public UserEntity getUserByUsername(String username);

	public void createUser(UserEntity user);

	public boolean updateUser();

	public void deleteUser(UserEntity user);

}
