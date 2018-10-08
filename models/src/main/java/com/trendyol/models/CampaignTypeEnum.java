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
public enum CampaignTypeEnum {
    PRODUCT(1, Product.class),
    CATEGORY(2, Category.class);

    private final Class campaignType;
    private final int value;

    CampaignTypeEnum(int value, Class campaignType) {
        this.value = value;
        this.campaignType = campaignType;
    }

    public int getValue() {
        return this.value;
    }
    public Class getEnumClass() {
        return this.campaignType;
    }
    public static CampaignTypeEnum getEnum(Object object){
        if (object instanceof Product){
            return PRODUCT;
        }
        else if (object instanceof Category){
            return CATEGORY;
        }
        throw new IllegalArgumentException("");
    }
}
