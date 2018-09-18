package com.jiegeshe.javaframwork.patternproxy.jdkproxy;

import java.lang.reflect.Proxy;

import com.jiegeshe.javaframwork.patternproxy.RealSubject;
import com.jiegeshe.javaframwork.patternproxy.Subject;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-09-18)
 */
public class Client {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Subject subject = (Subject) Proxy.newProxyInstance(
                Client.class.getClassLoader(),
                new Class[] { Subject.class },
                new JdkProxySubject(new RealSubject()));
        subject.doSomething();
        subject.doSomething2();
    }
}
