package com.company.decorator;

/**
 * Created by Madalina Dinga on 11.12.2017.
 */
public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addDressing();
    }

    private String addDressing(){
        return "+ mustard";
    }
}
