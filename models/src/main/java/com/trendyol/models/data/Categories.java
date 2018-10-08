/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models.data;

import com.trendyol.models.Category;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mesat
 */
public class Categories extends HashSet<Category>{
    
    private Categories() {
    }
    
    
    public static Categories getInstance() {
        return CategoriesHolder.INSTANCE;
    }
    
    private static class CategoriesHolder {

        private static final Categories INSTANCE = new Categories();
    }
    
    
}
