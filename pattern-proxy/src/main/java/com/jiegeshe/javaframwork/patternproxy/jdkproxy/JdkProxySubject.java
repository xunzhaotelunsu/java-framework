package com.jiegeshe.javaframwork.patternproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.jiegeshe.javaframwork.patternproxy.RealSubject;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-09-18)
 */
public class JdkProxySubject implements InvocationHandler {

    private RealSubject realSubject;

    JdkProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        System.out.println("before jdk proxy");
        Object result;
        try {
            result = method.invoke(this.realSubject, args);
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
            throw ex;
        } finally {
            System.out.println("after jdk proxy");
        }
        return result;
    }
}
