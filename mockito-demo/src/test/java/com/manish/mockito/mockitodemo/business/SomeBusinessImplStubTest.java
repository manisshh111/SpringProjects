package com.manish.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void test1() {
		DataServiceStub1 dataServiceStub1= new DataServiceStub1();
		SomeBusinessImpl businessImpl= new SomeBusinessImpl(dataServiceStub1);
		int result= businessImpl.findGreatest();
		assertEquals(25, result);
	    System.out.println(result);
	}
	@Test
	void test2() {
		DataServiceStub2 dataServiceStub2= new DataServiceStub2();
		SomeBusinessImpl businessImpl= new SomeBusinessImpl(dataServiceStub2);
		int result= businessImpl.findGreatest();
		assertEquals(35, result);
	    System.out.println(result);
}
}


//Stub: 
class DataServiceStub1 implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[] {25, 15, 5};
	}
	
}
class DataServiceStub2 implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[] {35, 25, 5};
	}
	
}

