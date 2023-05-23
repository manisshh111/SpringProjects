package com.manish.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "with Manish"),
				new Course(2, "Learn C#", "with Rajnish")
				
				);
	}
	
	@RequestMapping("/helloWorld")
	public String HelloWorld (){
		return "HelloWorld";
	}
}
