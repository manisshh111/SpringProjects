package com.manish.springboot.learnjpaandhibernate2.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manish.springboot.learnjpaandhibernate2.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	CourseJdbcRepository repository;  
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn Azure", "Manish"));
		repository.insert(new Course(2, "Learn Java", "Manish"));
		repository.insert(new Course(3, "Learn C#", "Manish"));
		repository.insert(new Course(4, "Learn C++", "Manish"));
		repository.insert(new Course(5, "Learn Python", "Manish"));
		repository.insert(new Course(6, "Learn ASP.net", "Manish"));
		repository.insert(new Course(7, "Learn Spring", "Manish"));
		repository.insert(new Course(8, "Learn Spring-boot", "Manish"));
		repository.insert(new Course(9, "Learn Hibernate", "Manish"));
		repository.insert(new Course(10, "Learn JPA", "Manish"));
		
		repository.delete(10);
		repository.delete(9);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		System.out.println(repository.findById(4));

		
		

	}

}
