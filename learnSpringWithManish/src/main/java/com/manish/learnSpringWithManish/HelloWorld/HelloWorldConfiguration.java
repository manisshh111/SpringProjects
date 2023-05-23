package com.manish.learnSpringWithManish.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name,int age,  Address address) {};
record Address(String city, String state, int pinCode) {};

@Configuration

// @Configuration to make it a configuration class
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Manish";
	}
	
	@Bean
	public int age() {
		return 1;
	}
	
	
	
	@Bean
	public Person person() {
		var person= new Person("Rajnish", 21, new Address("Patna", "Bihar", 841222));
		return person;
	}
	
	@Bean
	public Person personParameters(String name4, int age4, @Qualifier("address2Qualifier") Address address24) {
		return new Person(name4, age4, address24);
	}
	
	
	@Bean(name = "address1")
	@Primary
	public Address address1() {
	
		Address address= new Address("Siliguri_Primary", "West Bengal", 734003);
		return address;
	}
	
	
	
	
	@Bean(name = "address2")
	@Qualifier("address2Qualifier")
	public Address address() {
	
		Address address= new Address("Siliguri_Qualifier", "West Bengal", 734003);
		return address;
	}
	
	
	
//	@Bean
//	public Person person2() {
//		//Person person= new Person(name(), age());
//		//return person;
//	}
//	
	

}
