package com.jin.rose.DesignPatterns.Builder;

public class McDonaldsMeal {

    private String drink;
    private String burger;
    private String side;
    private int cost;

    /*
    // Builder inner static class to make it thread safe to avoid inconsistent states/race conditions
    public static class Builder{
        private String drink;
        private String burger;
        private String side;
        private int cost;

        public static Builder newInstance(){
            return new Builder();
        }

        private Builder(){}

        public Builder setDrink(String drink) {
        this.drink = drink;
        return this;
        }

        public Builder setBurger(String burger) {
            this.burger = burger;
            return this;
        }

        public Builder setSide(String side) {
            this.side = side;
            return this;
        }

        public Builder setCost(int cost) {
            this.cost = cost;
            return this;
        }
        //Creating McDonaldsMeal instance'
        public McDonaldsMeal build(){
            return new McDonaldsMeal(this);
        }
     */


    public McDonaldsMeal setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public McDonaldsMeal setBurger(String burger) {
        this.burger = burger;
        return this;
    }

    public McDonaldsMeal setSide(String side) {
        this.side = side;
        return this;
    }

    public McDonaldsMeal setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public String toString(){
        return "This McDonald's meal contains a " + this.burger + ", a " + this.side + ", and a " + this.drink +
                " with a total cost of $" + this.cost;
    }
}
