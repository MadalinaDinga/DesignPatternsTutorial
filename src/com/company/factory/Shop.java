package com.company.factory;

import com.company.factory.pages.CartPage;
import com.company.factory.pages.ItemPage;
import com.company.factory.pages.SearchPage;

/**
 * Created by Madalina Dinga on 13.12.2017.
 */
public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
