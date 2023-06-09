package com.bnuz.filemanagement.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.bnuz.filemanagement.common.Identity;
import com.bnuz.filemanagement.model.Admin;
import com.bnuz.filemanagement.model.User;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    public String getToken(User user){
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;  //一小时有效时间
        Date end = new Date(currentTime);
        String token = "";

        token = JWT.create().withAudience(String.valueOf(user.getId())).withIssuedAt(start).withExpiresAt(end)
                .withClaim("identity", Identity.USER.getIdentity())
                .sign(Algorithm.HMAC256(user.getPassword()));

        return token;

    }

    public String getTokenByAdmin(Admin admin){
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;  //一小时有效时间
        Date end = new Date(currentTime);
        String token = "";

        token = JWT.create().withAudience(String.valueOf(admin.getId())).withIssuedAt(start).withExpiresAt(end)
                .withClaim("identity", Identity.ADMIN.getIdentity())
                .sign(Algorithm.HMAC256(admin.getPassword()));

        return token;

    }
}
