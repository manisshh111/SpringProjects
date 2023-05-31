package com.manish.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"field1", "field2"})
@JsonFilter("SomeBeanFilter")
public class SomeBean {

	private String field1;
	
	//@JsonIgnore
	private String field2;
	private String field3;
	
	public SomeBean(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}

	public String getFiled1() {
		return field1;
	}

	public String getFiled2() {
		return field2;
	}

	public String getFiled3() {
		return field3;
	}

	@Override
	public String toString() {
		return "SomeBean [filed1=" + field1 + ", filed2=" + field2 + ", filed3=" + field3 + "]";
	}
	
	
}
