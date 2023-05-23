package com.manish.learnSpringWithManish.game;

public class GameRunner {
	
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		super();
		this.game = game;
	}

// Aditya a= new Aditya("myName", 23);
	
//	public GameRunner(GamingConsole game) {
//		game= game;
//	}

	
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
