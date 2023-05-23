package com.manish.learnSpringWithManish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.manish.learnSpringWithManish.game.GamingConsole;
import com.manish.learnSpringWithManish.game.MarioGame;

@Configuration
public class GamingSpringBeanConfiguration {

	@Bean
	public GamingConsole game() {
		var game= new MarioGame();
		return game;
	}
}
