package com.manish.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;
	
	
	
	@Test
	void test1() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 5});
		int result= businessImpl.findGreatest();
		assertEquals(25, result);

	}
	
	@Test
	void test2() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {35});
		int result= businessImpl.findGreatest();
		assertEquals(35, result);
	}


}



