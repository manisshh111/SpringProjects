package com.manish.mockito.mockitodemo.business;

public class SomeBusinessImpl {

	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}




	public int findGreatest() {
		int[] data = dataService.retrieveAllData();
		int max=Integer.MIN_VALUE;
		for(int value : data) {
			if(value>max) {
				max=value;
			}
		}
		return max;
	}
	
}

interface DataService{
	int[] retrieveAllData();
}
