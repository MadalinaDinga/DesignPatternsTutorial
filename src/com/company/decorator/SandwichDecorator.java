package com.company.decorator;

/**
 * Created by Madalina Dinga on 11.12.2017.
 */
public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich){
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }
}
