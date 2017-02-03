package com.softtek.academy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "book_order")
public class BookOrderEntity extends Audit implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "book_order_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	@OneToOne
	@JoinColumn(name = "book_id")
	private BookEntity book;
	


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

}
