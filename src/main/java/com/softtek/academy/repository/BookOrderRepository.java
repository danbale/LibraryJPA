package com.softtek.academy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.softtek.academy.domain.BookOrderEntity;

@Repository
public interface BookOrderRepository extends JpaRepository<BookOrderEntity, Long>{
	
	// Function used to find all the BookOrders in the database
	@Query(value = "SELECT boe FROM BookOrderEntity boe "
			+ "INNER JOIN  boe.order = o "
			+ "INNER JOIN  boe.book = b")
	public List<BookOrderEntity> getAllBookOrders();
	
}
