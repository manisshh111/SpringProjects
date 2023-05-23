package com.manish.learnSpringWithManish.game;

import org.springframework.stereotype.Component;

//@Component
public class PacManGame implements GamingConsole {

	public void up() {
		System.out.println("Pac up");
	}
	
	public void down() {
		System.out.println(" Pac sit down");
	}
	
	public void right() {
		System.out.println(" Pac shoot");
	}
	
	public void left() {
		System.out.println("Pac go back");
	}
}
