package com.softtek.academy.domain;


import java.io.Serializable;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book_genre")
public class BookGenreEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	BookKey key;

	public BookKey getKey() {
		return key;
	}

	public void setKey(BookKey key) {
		this.key = key;
	}
	
	

	public BookGenreEntity(BookKey key) {
		super();
		this.key = key;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
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
		BookGenreEntity other = (BookGenreEntity) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	

}
