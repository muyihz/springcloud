package com.muou.eurekaconsumer.support;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfigSupport {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
