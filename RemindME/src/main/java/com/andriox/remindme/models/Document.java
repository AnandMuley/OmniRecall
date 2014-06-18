package com.andriox.remindme.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_DOC", schema = "REMINDME")
public class Document {

	@Id
	private Integer id;
	private String name;
	private String description;

	public Document() {

	}

	public Document(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "DocumentBO [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}

}
