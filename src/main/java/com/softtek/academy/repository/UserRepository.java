package com.softtek.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.academy.domain.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	
	@Query(value = "SELECT u FROM UserEntity u WHERE u.username = :username")
	public UserEntity getUserByUsername(@Param ("username") String username);

}
