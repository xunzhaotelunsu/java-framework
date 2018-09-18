package com.jiegeshe.javaframwork.patternproxy.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-09-18)
 */
public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(final Object o, final Method method, final Object[] objects, final MethodProxy methodProxy) throws Throwable {
        System.out.println("before cglib proxy");
        Object result;
        try {
            result = methodProxy.invokeSuper(o, objects);
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
            throw ex;
        } finally {
            System.out.println("after cglib proxy");
        }
        return result;
    }
}
