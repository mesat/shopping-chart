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
public class Campaign extends Discount {

   
    private int minNumberOfItem;
    private Object item;
    private CampaignTypeEnum campaingTypeEnum;
    
   private Campaign() {

    }   

    /**
     *
     * @param item
     * @param discountValue
     * @param minNumberOfItem
     * @param discountTypeEnum
     */
    public Campaign(Object item, double discountValue,int minNumberOfItem, DiscountTypeEnum discountTypeEnum) {
        this.setDiscountTypeEnum(discountTypeEnum);
        this.setItem(item);
        this.setDiscountValue(discountValue);
        this.setMinNumberOfItem(minNumberOfItem);

    }
   
   /**
     * @return the item
     */
    public Object getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    private void setItem(Object item) {

        if (!this.campaingTypeEnum.getEnumClass().isInstance(item)) {
            throw new IllegalArgumentException("");
        }
        this.item = item;
    }

    /**
     * @return the campaingTypeEnum
     */
    public CampaignTypeEnum getCampaingTypeEnum() {
        return campaingTypeEnum;
    }

    /**
     * @param campaingTypeEnum the campaingTypeEnum to set
     */
    private void setCampaingTypeEnum(CampaignTypeEnum campaingTypeEnum) {
        this.campaingTypeEnum = campaingTypeEnum;
    }

    /**
     *
     * @param item should be a type of CampaingType
     * The item should be given to create a campaign
     */
    public Campaign(Object item) {
        
        setCampaingTypeEnum(CampaignTypeEnum.getEnum(item));
        this.item = item;

    }


    /**
     * @return the numberOfItem
     */
    public int getMinNumberOfItem() {
        return minNumberOfItem;
    }

    /**
     * @param numberOfItem the numberOfItem to set
     */
    public void setMinNumberOfItem(int minNumberOfItem) {
        this.minNumberOfItem = minNumberOfItem;
    }


    
}
