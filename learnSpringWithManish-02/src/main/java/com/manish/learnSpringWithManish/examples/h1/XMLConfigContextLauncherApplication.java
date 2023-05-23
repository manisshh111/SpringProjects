package com.manish.learnSpringWithManish.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.learnSpringWithManish.game.GameRunner;


public class XMLConfigContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml");

		) {

//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(GameRunner.class).run() ;
		}

	}

}
