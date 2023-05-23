package com.manish.learnSpringWithManish.HelloWorld;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1: Launch a spring context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) 
		{


			// configure the things that we want spring to manage -@configuration
			// Created a 'name' method as Bean

			// Retrieving beans managed by spring

			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address1"));
			System.out.println(context.getBean("personParameters"));
//			System.out.println(context.getBean(Address.class));

			// List all beans
			Stream<String> stream1= Arrays.stream(context.getBeanDefinitionNames());
			
			stream1.forEach(System.out::println);
			
		}


	}

}
