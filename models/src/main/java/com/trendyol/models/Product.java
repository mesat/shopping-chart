/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models;

import com.trendyol.models.data.Campaigns;

/**
 *
 * @author mesat
 */
public class Product implements Discountable{
    
    private long barcode;
    private String title;
    private double price;
    private int stock;
    private Category category;
    
    private Product(){
        
    }
    public Product (long barcode, String title, double price, Category category){
        
        this.setBarcode(barcode);
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Product)obj).getBarcode() == this.getBarcode();
    }
    
    

    /**
     * @return the id
     */
    public long getBarcode() {
        return barcode;
    }

    /**
     * @param id the id to set
     */
    private void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }
    

    @Override
    public void addCampain(Campaign campaign) {
        Campaigns.getInstance().add(campaign);
    }

    @Override
    public void removeCampain(Campaign campaign) {
        Campaigns.getInstance().remove(campaign);
    }

   
    
}
