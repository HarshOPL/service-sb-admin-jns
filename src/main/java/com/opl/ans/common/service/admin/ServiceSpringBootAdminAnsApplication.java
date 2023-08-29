package com.opl.ans.common.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 
 * @author hitesh.suthar.crt
 *
 */
@SpringBootApplication
@EnableAdminServer
public class ServiceSpringBootAdminAnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSpringBootAdminAnsApplication.class, args);
	}

}
