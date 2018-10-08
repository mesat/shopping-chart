/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models;

import com.trendyol.models.utils.Timestamper;

/**
 *
 * @author mesat
 */
public class Category implements Discountable{
    private long id;
    private String name;
    private Category parentCategory;
    
    public Category (){
        this.setId(Timestamper.next());
    }
    public Category (String name){
        this.setId(Timestamper.next());
        this.setName(name);
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new NullPointerException("category name cannot be null");
        }
        this.name = name.trim().toUpperCase();
    }

    /**
     * @return the parentCategory
     */
    public Category getParentCategory() {
        return parentCategory;
    }

    /**
     * @param parentCategory the parentCategory to set
     */
    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    @Override
    public void addCampain(Campaign campaign) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeCampain(Campaign campaign) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
