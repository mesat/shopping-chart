/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models;

import com.trendyol.models.data.Products;
import com.trendyol.models.data.ShoppingCarts;
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
public class DeliveryCostCalculatorTest {

    public DeliveryCostCalculatorTest() {
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
     * Test of calculateFor method, of class DeliveryCostCalculator.
     */
    @Test
    public void testCalculateFor() {
        System.out.println("calculateFor");
        Category category = new Category();
        category.setName("iphone");
        category.setParentCategory(new Category("phone"));
        Products.getInstance().add(new Product(1234567890123L, "the whole new iphone xv", 19999.99, category));
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(Products.getInstance().getProduct(1234567890123L), 1);
        ShoppingCarts.getInstance().add(cart);
        DeliveryCostCalculator instance = new DeliveryCostCalculator(1, 2, 1.09);
        double result = instance.calculateFor(cart);
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
