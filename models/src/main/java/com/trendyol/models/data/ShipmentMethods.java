/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models.data;

import com.trendyol.models.Campaign;
import java.util.HashSet;

/**
 *
 * @author mesat
 */
public class ShipmentMethods extends HashSet<Campaign>{
    
    private ShipmentMethods() {
    }
    
    public static ShipmentMethods getInstance() {
        return ShipmentMethodsHolder.INSTANCE;
    }
    
    private static class ShipmentMethodsHolder {

        private static final ShipmentMethods INSTANCE = new ShipmentMethods();
    }

  
    public boolean add(Object o, Campaign e) {
        return super.add(e); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
