package com.manish.learnSpringWithManish.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("Mario_Jump");
	}
	
	public void down() {
		System.out.println("Mario_go into the hole");
	}
	
	public void right() {
		System.out.println("Mario_Go back");
	}
	
	public void left() {
		System.out.println("Mario_Accelerate");
	}
}
