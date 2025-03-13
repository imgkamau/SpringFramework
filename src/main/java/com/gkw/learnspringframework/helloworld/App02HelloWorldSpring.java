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
package com.gkw.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1:Launch a spring context
		try (var context = new AnnotationConfigApplicationContext(HelloWordConfiguration.class)) {
			// 2: configure things we want spring to manage - @Configuration
			// 3: Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));

			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("person3Parameters"));

			System.out.println(context.getBean(Address.class));

			// System.out.println - Listing all Beans managed by Spring Framework.
			// Method 1:
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			// Method 2: Traditional Loop
			String[] beanNames = context.getBeanDefinitionNames();
			for (String name : beanNames) {
				System.out.println(name);
			}

		}
	} 

}
