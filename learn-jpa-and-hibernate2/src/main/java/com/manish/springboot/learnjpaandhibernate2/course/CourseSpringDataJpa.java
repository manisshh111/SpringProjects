package com.manish.springboot.learnjpaandhibernate2.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpa extends JpaRepository<Course, Long> {

	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
	
}
