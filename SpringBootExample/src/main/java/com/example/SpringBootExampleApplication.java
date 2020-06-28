package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootExampleApplication.class, args);
		/* Here we are using DI */
		Customers c = context.getBean(Customers.class); // we want an object of Customer class we have created. 
		c.display();
	}

}
