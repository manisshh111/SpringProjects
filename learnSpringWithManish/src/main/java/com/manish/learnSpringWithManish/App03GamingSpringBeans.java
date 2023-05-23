package com.manish.learnSpringWithManish;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.learnSpringWithManish.game.GameRunner;
import com.manish.learnSpringWithManish.game.GamingConsole;
import com.manish.learnSpringWithManish.game.MarioGame;
import com.manish.learnSpringWithManish.game.PacManGame;
import com.manish.learnSpringWithManish.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingSpringBeanConfiguration.class);

		) {
			context.getBean(GamingConsole.class).down();
		}

	}

}
