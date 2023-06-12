package com.manish.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MyAssertTest {

	List<String> todos= Arrays.asList("AWS", "Azure", "Devops");
	
	@Test
	void test() {
		boolean test1=  todos.contains("AWS");
		boolean test2= todos.contains("GCP");
		
		//assertEquals(true, test1);
		assertTrue(test1);
		assertFalse(test2);
		
		//assertNull, assertNotNull
		assertArrayEquals(new int[] {1, 2}, new int[] {2, 1});
		
		
		
	}
	
}
