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
public class Coupon extends Discount{
    
    private Coupon(){
        
    }
    
    /**
     *
     * @param minCartAmount
     * @param discountValue
     * @param discountTypeEnum
     */
    public Coupon(double minCartAmount, double discountValue, DiscountTypeEnum discountTypeEnum){
        setMinCartAmount(minCartAmount);
        setDiscountValue(discountValue);
        setDiscountTypeEnum(discountTypeEnum);
    }
    
    private double minCartAmount;  
   
   
    /**
     * @return the cartAmount
     */
    public double getMinCartAmount() {
        return minCartAmount;
    }

    /**
     * @param cartAmount the cartAmount to set
     */
    public void setMinCartAmount(double minCartAmount) {
        this.minCartAmount = minCartAmount;
    }
    
}
