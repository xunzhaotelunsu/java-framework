package com.jiegeshe.javaframwork.patternproxy.cglibproxy;

// import org.springframework.cglib.proxy.Enhancer;

import org.springframework.cglib.proxy.Enhancer;

import com.jiegeshe.javaframwork.patternproxy.RealSubject;
import com.jiegeshe.javaframwork.patternproxy.Subject;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-09-18)
 */
public class Client {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new CglibProxy());
        Subject proxySubject = (Subject) enhancer.create();
        proxySubject.doSomething();
        System.out.println("----------------");
        proxySubject.hello("stone");
        System.out.println("----------------");
        System.out.println(proxySubject.toString());
        System.out.println("----------------");
        System.out.println(proxySubject.hashCode());
        System.out.println("----------------");
        System.out.println(proxySubject.getClass());
    }
}
