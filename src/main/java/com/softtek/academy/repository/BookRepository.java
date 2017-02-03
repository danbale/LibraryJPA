package com.softtek.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.academy.domain.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{

	
	@Query(name="updateBook", nativeQuery=true)
	public boolean updateBook(@Param ("name") String name,
							  @Param("genre") String genre,
							  @Param("author") String author,
							  @Param("editorial") String editorial,
							  @Param("language")String language,
							  @Param("available")String available,
							  @Param("year")String year,
							  @Param("bookId")Long id);
	
	
	@Query(name="findOneBook", nativeQuery=true)
	public BookEntity findOneBook(@Param ("id") Long id);

}
