package com.softtek.academy.services;

import java.util.List;

import com.softtek.academy.domain.BookGenreEntity;
import com.softtek.academy.domain.BookKey;

public interface BookGenreService{
	
	public List<BookGenreEntity> getAllBookGenre();
	
	public BookGenreEntity getBookGenreById(BookKey key);

}
