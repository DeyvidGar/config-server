package com.midominio.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Principal class in spring boot config server.
 *
 * @author David G.
 * @version 1.0
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	/**
	 * Initializer spring application method main.
	 *
	 * @param args parameters.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
