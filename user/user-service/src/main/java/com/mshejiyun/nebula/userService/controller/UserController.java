package com.mshejiyun.nebula.userService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUserByToken")
    public String getUserByToken(@RequestParam String token) {
        return "Hi  richard !  i_have_recived token + " + token;
    }
}
