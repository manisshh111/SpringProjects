package com.manish.springboot.learnjpaandhibernate2.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manish.springboot.learnjpaandhibernate2.course.Course;
import com.manish.springboot.learnjpaandhibernate2.course.jdbc.CourseJdbcRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	CourseJdbcRepository repository; 
//	
//	@Autowired
//	courseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpa repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		repository.insert(new Course(1, "Learn Azure", "JPA"));
//		repository.insert(new Course(2, "Learn Java", "JPA"));
//		repository.insert(new Course(3, "Learn C#", "JPA"));
//		repository.insert(new Course(4, "Learn C++", "JPA"));
//		repository.insert(new Course(5, "Learn Python", "JPA"));
//		repository.insert(new Course(6, "Learn ASP.net", "JPA"));
//		repository.insert(new Course(7, "Learn Spring", "JPA"));
//		repository.insert(new Course(8, "Learn Spring-boot", "JPA"));
//		repository.insert(new Course(9, "Learn Hibernate", "JPA"));
//		repository.insert(new Course(10, "Learn JPA", "JPA"));
//		
//		repository.deleteById(10);
//		repository.deleteById(9);
//		
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
//		System.out.println(repository.findById(4));
		
		repository.save(new Course(1, "Learn Azure", "JPA"));
		repository.save(new Course(2, "Learn Java", "JPA"));
		repository.save(new Course(3, "Learn C#", "JPA"));
		repository.save(new Course(4, "Learn C++", "JPA"));
		repository.save(new Course(5, "Learn Python", "JPA"));
		repository.save(new Course(6, "Learn ASP.net", "Manish"));
		repository.save(new Course(7, "Learn Spring", "JPA"));
		repository.save(new Course(8, "Learn Spring-boot", "JPA"));
		repository.save(new Course(9, "Learn Hibernate", "JPA"));
		repository.save(new Course(10, "Learn JPA", "JPA"));
		
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));

		System.out.println(repository.findAll()); 
		System.out.println(repository.count()); 
		System.out.println(repository.findByAuthor("Manish")); 
		System.out.println(repository.findByName("Learn Java"));
		

	}

}
