/*This Java code is a simple demonstration of dependency injection in Java, 
*where a MarioGame object is passed into a GameRunner class
*It is inside the package com.gkw.learnspringframework.game.
*It is used as a game type.*/

package com.gkw.learnspringframework.game;

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
		
	}
	public void down() {
		System.out.println("Go into a hole");
		
	}
	public void left() {
		System.out.println("Go back");
		
	}
	public void right() {
		System.out.println("Accelerate");
		
	}

}
