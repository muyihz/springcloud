package com.muou.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonMain {
	public static void main(String[] args) {
		SpringApplication.run(RibbonMain.class, args);
	}
}
