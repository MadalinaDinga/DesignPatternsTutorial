package com.company.singleton;

/**
 * Created by Madalina Dinga on 13.12.2017.
 */
public class DbSingleton {
    //eagerly loaded -> created at the time the JVM started up
    private static DbSingleton instance = new DbSingleton();

    private DbSingleton(){

    }

    public static DbSingleton getInstance(){
        return instance;
    }
}
