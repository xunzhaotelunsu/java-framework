package com.jiegeshe.javaframework.springaop.security;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jiegeshe.javaframework.springaop.service.AuthService;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-07-19)
 */
@Aspect
@Component
public class SecurityAspect {

    @Autowired
    AuthService authService;

    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly() {

    }

    @Pointcut("execution(* com.jiegeshe.javaframework.springaop.service.ProductService3.*(..))")
    public void adminOnly2() {

    }

    @Before("adminOnly() || adminOnly2()")
    public void check() {
        authService.checkAccess();
    }
}
