package com.manish.learnSpringWithManish.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("SuperContra_up");
	}
	
	public void down() {
		System.out.println("SuperContra_sit down");
	}
	
	public void right() {
		System.out.println("SuperContra_shoot");
	}
	
	public void left() {
		System.out.println("SuperContra_go back");
	}
}
