package com.company.factory;

/**
 * Created by Madalina Dinga on 13.12.2017.
 */
public class WebsiteFactory {
    //public static Website getWebsite(String siteType){
    public static Website getWebsite(WebsiteType siteType){
        switch(siteType){
            case BLOG:{
                return new Blog();
            }

            case SHOP: {
                return new Shop();
            }

            default: {
                return null;
            }
        }
    }
}
