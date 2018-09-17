package com.jiegeshe.javaframework.aopspring.service;

import org.springframework.stereotype.Service;

import com.jiegeshe.javaframework.aopspring.domain.Product;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-07-19)
 */
@Service
public class ProductService3 {

    public void insert(Product product) {
        System.out.println("insert product");
    }

    public void delete(Long id) {
        System.out.println("delete product");
    }
}
