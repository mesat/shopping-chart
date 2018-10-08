/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models.data;

import com.trendyol.models.Campaign;
import com.trendyol.models.CampaignTypeEnum;
import com.trendyol.models.Category;
import com.trendyol.models.Product;
import java.util.HashSet;

/**
 *
 * @author mesat
 */
public class Campaigns extends HashSet<Campaign>{
    
    private Campaigns() {
    }
    
    public static Campaigns getInstance() {
        return CampaignsHolder.INSTANCE;
    }
    
    private static class CampaignsHolder {

        private static final Campaigns INSTANCE = new Campaigns();
    }

  
    public boolean add(Object o, Campaign e) {
        return super.add(e); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Campaign getCampaign(Object item){
        
        //throw exception if object type is not expected
        switch (CampaignTypeEnum.getEnum(item)){
            case PRODUCT:
                return getInstance().stream().filter(p -> ((Product)p.getItem()).equals(item)).findFirst().orElseGet(null);
            case CATEGORY:
                return getInstance().stream().filter(p -> ((Category)p.getItem()).equals(item)).findFirst().orElseGet(null);
            default:
                throw new AssertionError(CampaignTypeEnum.getEnum(item).name());
            
        }
        
    }
    
    
    
}
