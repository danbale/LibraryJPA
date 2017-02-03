package com.softtek.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.softtek.academy.domain.BookGenreEntity;
import com.softtek.academy.domain.BookKey;
import com.softtek.academy.repository.BookGenreRepository;

@Component
public class BookGenreServiceImpl implements BookGenreService{
	
	@Autowired
	BookGenreRepository bookGenreRepository;

	@Override
	public List<BookGenreEntity> getAllBookGenre() {
		return bookGenreRepository.findAll();
	}

	@Override
	public BookGenreEntity getBookGenreById(BookKey key) {
		// TODO Auto-generated method stub
		return null;
	}


}
