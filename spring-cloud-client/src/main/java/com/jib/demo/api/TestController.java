package com.jib.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springCloud")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "spring cloud demo test";
    }
}
