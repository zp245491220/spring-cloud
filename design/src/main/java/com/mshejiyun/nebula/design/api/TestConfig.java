package com.mshejiyun.nebula.design.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class TestConfig {

    @Value("${devMode}")
    private String devMode;

    @Value("${aliyun.jdbc}")
    private String jdbc;

    @RequestMapping("")
    public String index() {
        return devMode + jdbc;
    }
}
