package com.manish.learnSpringWithManish;

import com.manish.learnSpringWithManish.game.GameRunner;
import com.manish.learnSpringWithManish.game.MarioGame;
import com.manish.learnSpringWithManish.game.PacManGame;
import com.manish.learnSpringWithManish.game.SuperContraGame;



public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var marioGame= new MarioGame();  //1: Object creation
		var superContraGame= new SuperContraGame();
		var pacmanGame= new PacManGame();
		
		
		var gameRunner= new GameRunner(pacmanGame);  //2: Object creation + wiring of dependencies
		
	
		
		gameRunner.run();
		
	   

	}

}
