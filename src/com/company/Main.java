package com.company;

import com.company.builder.LunchOrder;
import com.company.builder.LunchOrderBean;
import com.company.builder.LunchOrderTele;
import com.company.decorator.DressingDecorator;
import com.company.decorator.MeatDecorator;
import com.company.decorator.Sandwich;
import com.company.decorator.SimpleSandwich;
import com.company.factory.Website;
import com.company.factory.WebsiteFactory;
import com.company.factory.WebsiteType;
import com.company.singleton.DbSingleton;
import com.company.singleton.DbSingletonLazyLoading;
import com.company.singleton.DbSingletonThreadSafe;

public class Main {

    public static void main(String[] args) {
        // DECORATOR

        // adding functionalities to the Simple Sandwich( modifying the structure of simple sandwich) => control the hierarchy
        // we do not have to create new instances of MeatDecorator every time we want to change the type of sandwich
	    Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());

        // BUILDER
        // case 1 - bean model
        // not immutable
        // unclear what attributes are required( no contract for valid lunch order)
        LunchOrderBean lOB = new LunchOrderBean();
        lOB.setBread("integrala");
        lOB.setCondiments("piper");
        lOB.setMeat("pui");
        lOB.setDressing("mustar");

        // case 2 - telescoping constructors = constructors build upon each other
        // they depend on each other( we cannot add dressing without adding condiments) -> order is important
        // but immutable
        LunchOrderTele lOBTele = new LunchOrderTele("integrala", "piper", "mustar", "pui");

        // case 3 - builder
        // enforce contract( constructors)
        // only getters => immutable
        //flexibility of the bean approach
        LunchOrder.Builder builder = new LunchOrder.Builder();
        // we can chop one of these
        builder.bread("integrala").condiments("piper").dressing("mustar").meat("turkey");

        LunchOrder lO = builder.build();

        // FACTORY
        //Website site = WebsiteFactory.getWebsite("blog");
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);  //using enum
        System.out.println(site.getPages());

        //site = WebsiteFactory.getWebsite("shop");
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);  //using enum
        System.out.println(site.getPages());

        //SINGLETON
        //eagerly loaded -> created at the time the JVM started up
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(instance == anotherInstance);

        // lazily loaded = defer initialization of an object until the point at which it is needed
        // -> we do not need all the pieces at the very start of the application( performance)
        DbSingletonLazyLoading lazyInstance = DbSingletonLazyLoading.getInstance();
        DbSingletonLazyLoading anotherLazyInstance = DbSingletonLazyLoading.getInstance();
        System.out.println(lazyInstance == anotherLazyInstance);

        // thread-safe
        DbSingletonThreadSafe lazyInstanceTS = DbSingletonThreadSafe.getInstance();
        DbSingletonThreadSafe anotherLazyInstanceTS = DbSingletonThreadSafe.getInstance();
        System.out.println(lazyInstanceTS == anotherLazyInstanceTS);

    }
}
