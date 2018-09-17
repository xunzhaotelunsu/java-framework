package com.jiegeshe.javaframework.springaop.domain;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-07-19)
 */
public class Product {

    private Long id;

    private String name;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
