package com.manish.learnSpringWithManish.game;

public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("go into the hole");
	}
	
	public void right() {
		System.out.println("Go back");
	}
	
	public void left() {
		System.out.println("Accelerate");
	}
}
