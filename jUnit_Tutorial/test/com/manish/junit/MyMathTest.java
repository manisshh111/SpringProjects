package com.manish.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyMathTest {

	@Test
	void test1() {
		MyMath math = new MyMath();
		int result= math.calculateSum(new int[] {1,2,3});
	
		int expectedResult= 6;                                           ;
		assertEquals(expectedResult, result);
	}
	
	@Test
	void test2() {
		MyMath math = new MyMath();
		int result= math.calculateSum(new int[] {});
		System.out.println(result);
		int expectedResult= 0 ;                                          ;
		assertEquals(expectedResult, result);
	}
}
