package com.puttuboi.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}

@RestController
class ClientController{

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/clients/{applicationName}")
	public @ResponseBody
	ServiceInstance getClientsByApplicationName(@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName).get(0);
	}

	@GetMapping("/available")
	public String availableStatus(){
		return "Well hello there";
	}
}
