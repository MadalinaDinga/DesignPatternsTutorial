package com.company.factory;

import com.company.factory.pages.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Madalina Dinga on 13.12.2017.
 */

public abstract class Website {
    protected List<Page> pages= new ArrayList<>();

    public Website(){
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }
    // factory method
    public abstract void createWebsite();
}
