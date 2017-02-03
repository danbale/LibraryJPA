package com.softtek.academy.services;

import java.util.List;

import com.softtek.academy.domain.GenreEntity;

public interface GenreService {
	
	public List<GenreEntity> getAllGenre();
	
	public GenreEntity getGenreById(Long id);

}
