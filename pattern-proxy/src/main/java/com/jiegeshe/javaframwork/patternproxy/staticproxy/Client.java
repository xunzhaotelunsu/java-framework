package com.jiegeshe.javaframwork.patternproxy.staticproxy;

import com.jiegeshe.javaframwork.patternproxy.RealSubject;
import com.jiegeshe.javaframwork.patternproxy.Subject;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-09-17)
 */
public class Client {

    public static void main(String[] args){
        RealSubject proxySubject = new InheritStaticProxy();
        proxySubject.doSomething();
        proxySubject.hello("stone");
        System.out.println("----------------");
        Subject proxySubject2 = new InterfaceStaticProxy(new RealSubject());
        proxySubject2.doSomething();
        proxySubject2.hello("stone");
    }
}
