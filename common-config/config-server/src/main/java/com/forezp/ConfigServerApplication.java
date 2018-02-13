package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableConfigServer
/*
 * spring cloud的discovery service有多种实现方式（eureka、consul、zookeeper等等），
 * @EnableDiscoveryClient基于spring-cloud-commons,
 * @EnableEurekaClient基于spring-cloud-netflix。
 */
@EnableDiscoveryClient //提高移植性使用
//@EnableEurekaClient
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
