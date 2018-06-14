package com.mshejiyun.nebula.design.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getUserByToken")
    public String getUserByToken() {
        return restTemplate.getForObject("http://user-server/user/getUserByToken?token=tokenStr", String.class);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
