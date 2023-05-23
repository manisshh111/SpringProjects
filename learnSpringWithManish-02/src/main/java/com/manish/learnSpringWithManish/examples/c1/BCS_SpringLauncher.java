package com.manish.learnSpringWithManish.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan
public class BCS_SpringLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BCS_SpringLauncher.class);

		) {

//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}

	}

}
