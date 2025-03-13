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

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gkw.learnspringframework.game.GameRunner;
import com.gkw.learnspringframework.game.GamingConsole;
import com.gkw.learnspringframework.game.MarioGame;
import com.gkw.learnspringframework.game.PacManGame;
import com.gkw.learnspringframework.game.superContraGame;

import com.gkw.learnspringframework.game.GameRunner;
import com.gkw.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext
				(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();			
			context.getBean(GameRunner.class).run();
		}
	}

}
