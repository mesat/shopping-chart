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
public enum DiscountTypeEnum {
    RATIO(1),
    AMOUNT(2);

    private final int value;

    DiscountTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
