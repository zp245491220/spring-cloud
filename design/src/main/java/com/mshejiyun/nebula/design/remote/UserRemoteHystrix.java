package com.mshejiyun.nebula.design.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2017/5/15.
 */
@Component
public class UserRemoteHystrix implements UserRemote {


    @Override
    public String getUserByToken(String token) {
        return "sorry richard " + token + ", this send failed ";
    }
}
