package com.manish.learnSpringWithManish.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game= game;
	}

//	SuperContraGame game;
//	public GameRunner(SuperContraGame game) {
//		this.game= game;
//	}
	
	public void run() {
		// TODO Auto-generated method stub
	  System.out.println("Game is Running");
	  game.up();
	  game.down();
	  game.left();
	  game.right();
		
	}

}
