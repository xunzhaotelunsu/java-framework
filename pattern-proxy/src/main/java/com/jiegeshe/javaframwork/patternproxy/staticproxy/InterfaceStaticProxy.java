package com.jiegeshe.javaframwork.patternproxy.staticproxy;

import com.jiegeshe.javaframwork.patternproxy.RealSubject;
import com.jiegeshe.javaframwork.patternproxy.Subject;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-09-17)
 */
public class InterfaceStaticProxy implements Subject {

    private RealSubject realSubject;

    InterfaceStaticProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void doSomething() {
        System.out.println("before static proxy");
        try {
            this.realSubject.doSomething();
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
            this.realSubject.hello(name);
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
            throw ex;
        } finally {
            System.out.println("after static proxy");
        }
    }
}
