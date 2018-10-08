/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models.data;

import com.trendyol.models.Product;
import java.util.HashSet;

/**
 *
 * @author mesat
 */
public class Products extends HashSet<Product>{
    
    private Products() {
    }
    
    public static Products getInstance() {
        return ProductsHolder.INSTANCE;
    }
    
    private static class ProductsHolder {

        private static final Products INSTANCE = new Products();
    }
    public Product getProduct(long barcode){
        return getInstance().stream().filter(p -> p.getBarcode() == barcode).findFirst().get();
    }
    
    
}
