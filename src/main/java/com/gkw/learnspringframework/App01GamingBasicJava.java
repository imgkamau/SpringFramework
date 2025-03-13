/*
 * This is the main entry point of the application.
 * It imports the necessary classes from the game package.
 *Inside main(), it creates a MarioGame object.
 *Then, it passes the MarioGame object to GameRunner, following constructor-based dependency injection.
 *Finally, it calls gameRunner.run(), which prints a message.
 *Using var to simplify code
 *Its a new feature introduced in Java 10.
 *Type inference: Allows the compiler to infer the type of the variable based on the value assigned.
 *Readable code by reducing boilerplate 
		 * */
package com.gkw.learnspringframework;

import com.gkw.learnspringframework.game.GameRunner;
import com.gkw.learnspringframework.game.MarioGame;
import com.gkw.learnspringframework.game.PacManGame;
import com.gkw.learnspringframework.game.superContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new superContraGame();
		var game = new PacManGame(); //1: Object Creation
		var gameRunner = new GameRunner(game); 
		//2: Object creation + Wiring of dependencies
		//Game is a dependency of the GameRunner class.

		gameRunner.run();

	}

}
