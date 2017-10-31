package com.muou.eurekaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@EnableAutoConfiguration
@RestController
public class TestController {
	@Autowired
	private  DiscoveryClient discoveryClient;
	@RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return discoveryClient.getInstances(applicationName);
    }
	
	@RequestMapping("/")
    public String sayhello() {
        return "hello";
    }
	
    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services+"11111111111111");
        return services;
    }
}
