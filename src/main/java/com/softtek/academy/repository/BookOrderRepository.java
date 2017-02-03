package com.softtek.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.academy.domain.BookOrderEntity;

@Repository
public interface BookOrderRepository extends JpaRepository<BookOrderEntity, Long>{

}
