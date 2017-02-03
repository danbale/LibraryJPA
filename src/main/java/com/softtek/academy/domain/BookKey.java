package com.softtek.academy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookKey implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "book_id", unique = true, nullable = false)
	private Long bookId;

	@Column(name = "genre_id", unique = true, nullable = false)
	private Long genreId;

	
	
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((genreId == null) ? 0 : genreId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookKey other = (BookKey) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		if (genreId == null) {
			if (other.genreId != null)
				return false;
		} else if (!genreId.equals(other.genreId))
			return false;
		return true;
	}

}
