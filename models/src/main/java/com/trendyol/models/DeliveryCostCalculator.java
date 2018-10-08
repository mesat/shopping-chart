/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models;

/**
 *
 * @author mesat
 */
public class DeliveryCostCalculator {
    
    private double costPerDelivery;
    private double costPerProduct;
    private double fixedCost;
    
    private DeliveryCostCalculator(){
        
    }

    /**
     *
     * @param costPerDelivery
     * @param costPerProduct
     * @param fixedCost
     */
    public DeliveryCostCalculator(double costPerDelivery,double costPerProduct,double fixedCost){
        this.costPerDelivery = costPerDelivery;
        this.costPerProduct = costPerProduct;
        this.fixedCost = fixedCost;
        
    }
    public double calculateFor(ShoppingCart cart){
        return (costPerDelivery * cart.getNumberOfDeliveries()) + (costPerProduct * cart.getNumberOfProducts()) + fixedCost;
    }
    
}
