package com.softtek.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.softtek.academy.domain.GenreEntity;
import com.softtek.academy.repository.GenreRepository;

@Component
public class GenreServiceImpl implements GenreService{
	
	@Autowired
	GenreRepository genreRepository;

	@Override
	public List<GenreEntity> getAllGenre() {
		return genreRepository.findAll();
	}

	@Override
	public GenreEntity getGenreById(Long id) {
		return genreRepository.findOne(id);
	}
	

}
