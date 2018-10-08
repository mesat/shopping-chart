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
public class Discount {
    
    protected int id;
    protected String discountName;
    protected String description;
    protected DiscountTypeEnum discountTypeEnum;
    protected double discountValue;
    protected boolean Combinative = true;

    public Discount() {
    }

    /**
     * @return the discountValue
     */
    public double getDiscountValue() {
        return discountValue;
    }

    /**
     * @param discountValue the discountValue to set
     */
    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the discountName
     */
    public String getDiscountName() {
        return discountName;
    }

    /**
     * @param discountName the discountName to set
     */
    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    /**
     * @return the isCombinative
     */
    public boolean isCombinative() {
        return Combinative;
    }

    /**
     * @param isCombinative the isCombinative to set
     */
    public void setCombinative(boolean Combinative) {
        this.Combinative = Combinative;
    }

    /**
     * @return the discountTypeEnum
     */
    public DiscountTypeEnum getDiscountTypeEnum() {
        return discountTypeEnum;
    }

    /**
     * @param discountTypeEnum the discountTypeEnum to set
     */
    public void setDiscountTypeEnum(DiscountTypeEnum discountTypeEnum) {
        this.discountTypeEnum = discountTypeEnum;
    }
    
}
