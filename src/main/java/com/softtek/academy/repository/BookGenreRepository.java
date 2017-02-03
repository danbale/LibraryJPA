package com.softtek.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.academy.domain.BookGenreEntity;
import com.softtek.academy.domain.BookKey;

public interface BookGenreRepository extends JpaRepository<BookGenreEntity, BookKey>{

}
