package com.manish.learnSpringWithManish.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.manish.learnSpringWithManish.game")
public class App03GamingSpringBeans{


//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		System.out.println("Parameter: " + game);
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);

		) 
		{
			//context.getBean(GamingConsole.class).down();
			context.getBean(GameRunner.class).run();
		}

	}

}
