/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models.data;

import com.trendyol.models.ShoppingCart;
import com.trendyol.models.Category;
import com.trendyol.models.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mesat
 */
public class CartsTest {

    public CartsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class Carts.
     */
    @Test
    public void testGetInstance() {

        try {
            System.out.println("getInstance");
            ShoppingCarts result = ShoppingCarts.getInstance();
            Category category = new Category();
            category.setName("iphone");
            category.setParentCategory(new Category("phone"));
            Products.getInstance().add(new Product(1234567890123L, "the whole new iphone xv", 19999.99, category));
            ShoppingCart cart = new ShoppingCart();
            cart.addProduct(Products.getInstance().getProduct(1234567890123L), 1);
            result.add(cart);
            assertTrue(true);
        } catch (Exception e) {
            fail(e.getMessage());

        }
    }

}
