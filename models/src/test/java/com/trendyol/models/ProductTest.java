/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models;

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
public class ProductTest {

    public ProductTest() {
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
     * Test of equals method, of class Product.
     */
    @Test
    public void testEquals() {
        try {
            System.out.println("equals");
            Object obj = new Product(0L, "", 0, null);
            Product instance = new Product(0L, "", 0, null);
            boolean expResult = true;
            boolean result = instance.equals(obj);
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is a prototype.");

        }

    }

}
