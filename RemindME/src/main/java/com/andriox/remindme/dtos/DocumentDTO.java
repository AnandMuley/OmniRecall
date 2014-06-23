package com.andriox.remindme.dtos;

import java.io.Serializable;

public class DocumentDTO implements Serializable {

	private static final long serialVersionUID = -8793451123429194279L;
	private int id;
	private String name;
	private String description;

	public DocumentDTO() {

	}

	public DocumentDTO(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		return "DocumentDTO [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}

}
