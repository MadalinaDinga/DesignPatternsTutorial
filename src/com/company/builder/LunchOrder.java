package com.company.builder;

/**
 * Created by Madalina Dinga on 12.12.2017.
 */
public class LunchOrder {

    // enforce contract( constructors)
    // only getters => immutable
    //flexibility of the bean approach
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder(){

        }

        // return a new lunch order using this
        public LunchOrder build(){
            return new LunchOrder(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            // return the Builder object
            return this;
        }
        public Builder condiments(String bread){
            this.condiments = condiments;
            // return the Builder object
            return this;
        }
        public Builder dressing(String bread){
            this.dressing = dressing;
            // return the Builder object
            return this;
        }
        public Builder meat(String bread){
            this.meat = meat;
            // return the Builder object
            return this;
        }
    }

    private final String bread = "";
    private final String condiments = "";
    private final String dressing = "";
    private final String meat = "";

    private LunchOrder(Builder builder){

    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
