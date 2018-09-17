package com.jiegeshe.javaframework.springaop.service;

import org.springframework.stereotype.Service;

import com.jiegeshe.javaframework.springaop.security.CurrentUserHolder;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-07-19)
 */
@Service
public class AuthService {

    public void checkAccess() {
        String user = CurrentUserHolder.get();
        if (!"admin".equals(user)) {
            throw new RuntimeException("Permission denied");
        }
    }
}
