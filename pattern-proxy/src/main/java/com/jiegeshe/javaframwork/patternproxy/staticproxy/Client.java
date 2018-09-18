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
        Subject subject = new StaticProxy(new RealSubject());
        subject.doSomething();
        subject.doSomething2();
    }
}
