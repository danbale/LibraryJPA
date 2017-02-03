package com.softtek.academy.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class Audit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "created_date", nullable = false, updatable = false)
	private Date createdDate;

	@Column(name = "modified_date", nullable = false, updatable = false)
	private Date modifiedDate;

}
