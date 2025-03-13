package com.gkw.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java beans
//Public accessor methods, constructor,
//equals, hashcode and toString are automatically created.
//Release in JDK16.

record Person (String name, int age, Address address) { };

//Address - firstLine & City
record Address (String firstLine, String city) { };

@Configuration
public class HelloWordConfiguration {
	@Bean
	public String name() {
		return "George";
	}
	
	@Bean
	public int age() {
		return 32;
	}

	//Wiring with method calls and parameters
	@Bean
	public Person person() {		
		return new Person("Keith", 4, new Address("C/ D.D.Leon 61", "Madrid"));
		
	}

	//Making use of existing Spring managed beans to create new beans.
	
	//Option 1:methodcall
	@Bean
	public Person person2MethodCall() {		
		return new Person(name(), age(), address());
		
	}
	//Option 2: Use of parameters - autowiring using parameters
	@Bean
	public Person person3Parameters(String name, int age, @Qualifier("address3qualifier") Address address) {		
		return new Person(name, age, address);
		
	}	
	
	@Bean(name = "address2")
	@Primary
	public Address address() {		
		return new Address("Pj Montserrat 3", "Madrid");
		
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {		
		return new Address("C/ Nunez de Balboa 105", "Madrid");
		
	}
}
