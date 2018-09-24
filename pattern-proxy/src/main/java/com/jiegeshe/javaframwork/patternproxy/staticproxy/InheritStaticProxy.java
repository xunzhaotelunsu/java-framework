package com.jiegeshe.javaframwork.patternproxy.staticproxy;

import com.jiegeshe.javaframwork.patternproxy.RealSubject;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-09-17)
 */
public class InheritStaticProxy extends RealSubject {

    @Override
    public void doSomething() {
        System.out.println("before static proxy");
        try {
            super.doSomething();
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
            throw ex;
        } finally {
            System.out.println("after static proxy");
        }
    }

    @Override
    public void hello(String name) {
        System.out.println("before static proxy");
        try {
            super.hello(name);
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
            throw ex;
        } finally {
            System.out.println("after static proxy");
        }
    }
}
