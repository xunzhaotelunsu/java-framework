package com.jiegeshe.javaframework.springaop.service;

import org.springframework.stereotype.Service;

import com.jiegeshe.javaframework.springaop.domain.Product;
import com.jiegeshe.javaframework.springaop.security.AdminOnly;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-07-19)
 */
@Service
public class ProductService2 {

    @AdminOnly
    public void insert(Product product) {
        System.out.println("insert product");
    }

    @AdminOnly
    public void delete(Long id) {
        System.out.println("delete product");
    }
}