/**
 * 
 */
package com.trinity.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author trinity-PC
 *
 */
@SpringBootApplication
@ComponentScan("com.trinity.controller,com.trinity.daoImpl,com.trinity.serviceImpl")
public class TrinitySpringBootApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(TrinitySpringBootApplication.class, args);
	}

}
