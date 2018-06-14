package com.mshejiyun.nebula.design.api;

import com.mshejiyun.nebula.design.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test2")
public class Test2Controller {

    @Autowired
    UserRemote userRemote;

    @RequestMapping("/getUserByToken/{token}")
    public String getUserByToken(@PathVariable("token") String token) {
        return userRemote.getUserByToken(token);
    }
}

