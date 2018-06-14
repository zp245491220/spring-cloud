package com.mshejiyun.nebula.design.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2017/5/11.
 */
@FeignClient(name = "user-server", path = "/user", fallback = UserRemoteHystrix.class)
public interface UserRemote {

    @RequestMapping(value = "/getUserByToken", method = RequestMethod.GET)
    public String getUserByToken(@RequestParam(value = "token") String token);

}
