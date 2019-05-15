package com.jib.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/springCloud")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test1")
    public String test() {
        String url = "http://spring-cloud-client:8080/springCloud/test";
        String result = restTemplate.getForObject(url, String.class);
        return result + "\nspring-cloud-demo-client1";
    }
}
