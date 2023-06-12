package com.manish.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyBeforeAfterTest {

	@BeforeAll
	 static void beforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	 void beforeEach() {
		System.out.println("Before Each");
	}
	
	@Test
	void test1() {
	 System.out.println("Test1");
	}
	
	@Test
	void test2() {
	 System.out.println("Test2");
	}
	
	@Test
	void test3() {
	 System.out.println("Test3");
	}
	
	@Test
	void test4() {
	 System.out.println("Test4");
	}
	
	@AfterAll
	 static 
	 void afterAll() {
		System.out.println("After All");
	}
	
	@AfterEach
	 void afterEach() {
		System.out.println("After Each");
	}
}
