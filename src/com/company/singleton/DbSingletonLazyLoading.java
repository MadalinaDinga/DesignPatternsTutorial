package com.company.singleton;

/**
 * Created by Madalina Dinga on 13.12.2017.
 */
public class DbSingletonLazyLoading {
    private static DbSingletonLazyLoading instance =null;

    private DbSingletonLazyLoading(){

    }

    public static DbSingletonLazyLoading getInstance(){
        //lazily loaded
        if (instance == null){
            instance= new DbSingletonLazyLoading();
        }
        return instance;
    }
}
