package com.rutvikpatel.ms.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMicroserviceServerMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryMicroserviceServerMasterApplication.class, args);
	}
}
