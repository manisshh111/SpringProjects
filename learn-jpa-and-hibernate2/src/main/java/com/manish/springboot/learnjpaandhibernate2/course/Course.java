package com.manish.springboot.learnjpaandhibernate2.course;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity(name="Table_name") : if table name and course name are different

@Entity
public class Course {

	@Id
	private long id;
	
	//@Column(name="author")  if class filed name and column name are different
	@Column
	private String name;
	@Column
	private String author;

	public Course() {

	}

	public Course(long id) {
		this.id = id;
	}


	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
