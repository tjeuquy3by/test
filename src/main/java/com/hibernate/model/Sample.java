package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "SAMPLE")
@SelectBeforeUpdate(value = true)
public class Sample {
	private String id;
	private String name;
	private String description;
	private Long quatity;
	private String createDate;

	@Column(name = "ID", length = 30)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "QUATITY")
	public Long getQuatity() {
		return quatity;
	}

	public void setQuatity(Long quatity) {
		this.quatity = quatity;
	}

	@Column(name = "CREATEDATE")
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
}
