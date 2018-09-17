package com.jiegeshe.javaframework.springaop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jiegeshe.javaframework.springaop.security.CurrentUserHolder;
import com.jiegeshe.javaframework.springaop.service.ProductService;

/**
 * @author stone
 * @version 1.0.0
 * @since 1.0.0 (2018-08-16)
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductService1Test {

    @Autowired
    ProductService productService;

    @Test(expected = Exception.class)
    public void stoneProductServiceTest() {
        CurrentUserHolder.set("stone");
        this.productService.delete(1L);
    }

    @Test
    public void adminProductServiceTest() {
        CurrentUserHolder.set("admin");
        this.productService.delete(1L);
    }
}
