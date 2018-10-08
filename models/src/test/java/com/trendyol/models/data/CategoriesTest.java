/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models.data;

import com.trendyol.models.Category;
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
public class CategoriesTest {

    public CategoriesTest() {
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
     * Test of getInstance method, of class Categories.
     */
    @Test
    public void testGetInstance() {
        try {
            System.out.println("getInstance");
            Categories expResult = null;
            Categories result = Categories.getInstance();
            Category category = new Category();
            category.setName("iphone");
            category.setParentCategory(new Category("phone"));
            result.add(category);
            boolean remove = result.remove(Categories.getInstance().stream().anyMatch(p->p.getName().equals(category.getName())));
            assertTrue(remove);
        } catch (Exception e) {
            fail(e.getMessage());

        }

    }

}
