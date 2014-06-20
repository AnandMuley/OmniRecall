package com.andriox.remindme.dtos;

public class DocumentDTO {

	private Integer id;
	private String name;
	private String description;

	public DocumentDTO() {

	}

	public DocumentDTO(String name, String description) {
		super();
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
		return "DocumentDTO [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}

}
