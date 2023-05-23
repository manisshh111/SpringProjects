package com.manish.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {

	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-controller")
	public CurrencyServiceConfiguration retrieveAllCourses(){
		return configuration;
	}
	
	
}
