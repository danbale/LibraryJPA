package com.softtek.academy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.softtek.academy.domain.UserEntity;
import com.softtek.academy.domainDTO.UserEntityDTO;



public class AuthenticationServiceImpl implements UserDetailsService{
	
	@Autowired 
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntityDTO userValidation;
		
		UserEntity u = userService.getUserByUsername(username);
		if(u != null)
		{
			userValidation = new UserEntityDTO(u.getId(), u.getUsername(), u.getPassword(), u.getEmail(), u.getName());
			return new org.springframework.security.core.userdetails.User(
					userValidation.getUsername(),
					userValidation.getPassword().toLowerCase(),
					true,
					true,
					true,
					true,
					getGrantedAuthority(userValidation));
		}
		
		return null;
	}
	
	public List<GrantedAuthority> getGrantedAuthority(UserEntityDTO user){
		List<GrantedAuthority> grantedAList = new ArrayList<GrantedAuthority>();
		grantedAList.add(new SimpleGrantedAuthority("ROLE_USER"));
		return grantedAList;
	}

}
