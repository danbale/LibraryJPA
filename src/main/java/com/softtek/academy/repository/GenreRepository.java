package com.softtek.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.academy.domain.GenreEntity;

public interface GenreRepository extends JpaRepository<GenreEntity, Long>{

}
