package com.jiegeshe.javaframework.springaop.security;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-07-19)
 */
public class CurrentUserHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get() {
        return holder.get() == null ? "unkown" : holder.get();
    }

    public static void set(String user) {
        holder.set(user);
    }
}