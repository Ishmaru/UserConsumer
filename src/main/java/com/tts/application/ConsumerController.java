package com.tts.application;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@GetMapping("/")
	public void index(){
        RestTemplate restTemplate = new RestTemplate();
		Map<?,?> user = restTemplate.getForObject("http://localhost:8080/User/1", HashMap.class);
	    System.out.println(user.get("name"));
	}
}
