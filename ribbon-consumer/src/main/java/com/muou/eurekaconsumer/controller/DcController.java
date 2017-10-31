package com.muou.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {
	//@Autowired
	//private LoadBalancerClient balancerClient;
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://eureks-client/dc", String.class);
    }
	
}
