package com.company.singleton;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Madalina Dinga on 13.12.2017.
 */
public class DbSingletonThreadSafe {
    private static DbSingletonThreadSafe instance =null;

    private DbSingletonThreadSafe(){
        // load class in memory here => ready to be utilized
    }

    // it never takes parameters
    public static DbSingletonThreadSafe getInstance(){
        // the outer layer is not thread-safe + check twice
        if (instance == null){
            // we care to be synchronized only for the 1st time we run this
            synchronized (DbSingleton .class){
                if (instance == null) {
                    instance = new DbSingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
