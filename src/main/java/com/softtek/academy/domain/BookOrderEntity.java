package com.softtek.academy.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;


@Entity
@Table(name = "book_order")
@NamedNativeQueries({
	@NamedNativeQuery(
			name="bookOrderList",
			query= "SELECT boe.order_id as order_id, "
					+ "b.book_id as book_id,"
					+ "b.book_name as name,"
					+ "b.book_author as author,"
					+ "b.book_editor as editorial,"
					+ "b.book_lng as language,"
					+ "b.book_status as status,"
					+ "b.book_year as year"
					+ " FROM book_order boe "
					+ "JOIN book b ON boe.book_id = b.book_id;",
					resultSetMapping = "bookOrderListResult"
					
			)
})

@SqlResultSetMappings({
	@SqlResultSetMapping(name="bookOrderListResult",
			classes = {
					@ConstructorResult(
							targetClass = BookOrderEntity.class,
							columns = {
									@ColumnResult(name = "order_id", type =Long.class),
									@ColumnResult(name = "name", type = String.class),
									@ColumnResult(name = "author" , type = String.class),
									@ColumnResult(name = "editorial", type = String.class),
									@ColumnResult(name = "language" , type = String.class),
									@ColumnResult(name = "status", type = Boolean.class),
									@ColumnResult(name = "year" , type = Long.class)
							})
			}
			)
		
})
public class BookOrderEntity  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "book_order_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	@ManyToOne
	@JoinColumn(name = "book_id")
	private BookEntity book;
	
	@Column(name = "created_date")
	private Date createDate;
	
	@Column(name = "modified_date")
	private Date modifiedDate;
	

	@Override
	public String toString() {
		return "BookOrderEntity [id=" + id + ", order=" + order + ", book=" + book + "]";
	}

	public BookOrderEntity(){
		super();
	}

	public BookOrderEntity(Long id, OrderEntity order, BookEntity book){
		super();
		this.id = id;
		this.order = order;
		this.book = book;
	}
	
	
	
	public BookOrderEntity(OrderEntity order, BookEntity book) {
		super();
		this.order = order;
		this.book = book;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	public BookEntity getBook() {
		return book;
	}

	public void setBook(BookEntity book) {
		this.book = book;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((order == null) ? 0 : order.hashCode());
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
		BookOrderEntity other = (BookOrderEntity) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		return true;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	

}
