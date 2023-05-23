package com.manish.springboot.learnjpaandhibernate2.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.manish.springboot.learnjpaandhibernate2.course.Course;
@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String insertQuery= """
			insert into course (id, name, author) values (?, ?, ?);
			
			""";
	
	private static String deleteQuery= """
			delete from course where id=?;
			
			""";
	
	private static String selectQuery="""
			select * from course where id=?;
			""";
	
	
	public void insert(Course course) {
		springJdbcTemplate.update(insertQuery, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void delete(long id) {
		springJdbcTemplate.update(deleteQuery, id);
	
	}
	
	public Course findById(long id) {
		return springJdbcTemplate.queryForObject(selectQuery, new BeanPropertyRowMapper<>(Course.class), id );
		//ResultSet-->Bean : Mapping==> Row Mappers
	}

	

}
