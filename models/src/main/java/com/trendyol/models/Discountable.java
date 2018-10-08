/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mesat
 */
public interface Discountable {
    void addCampain(Campaign campaign);
    void removeCampain(Campaign campaign);
    
}
