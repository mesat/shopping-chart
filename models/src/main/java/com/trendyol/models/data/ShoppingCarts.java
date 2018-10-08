/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models.data;

import com.trendyol.models.ShoppingCart;
import java.util.HashSet;

/**
 *
 * @author mesat
 */
public class ShoppingCarts extends HashSet<ShoppingCart>{
    
    private ShoppingCarts() {
    }
    
    public static ShoppingCarts getInstance() {
        return ShoppingCartsHolder.INSTANCE;
    }
    
    private static class ShoppingCartsHolder {

        private static final ShoppingCarts INSTANCE = new ShoppingCarts();
    }
    
    
}
