package com.jiegeshe.javaframework.springaop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiegeshe.javaframework.springaop.domain.Product;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-07-19)
 */
@Service
public class ProductService {

    @Autowired
    AuthService authService;

    public void insert(Product product) {
        this.authService.checkAccess();
        System.out.println("insert product");
    }

    public void delete(Long id) {
        this.authService.checkAccess();
        System.out.println("delete product");
    }
}
