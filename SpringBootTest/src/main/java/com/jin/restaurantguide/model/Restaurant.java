package com.jin.restaurantguide.model;

public class Restaurant {
    private long restaurantID;
    private String restaurantName;
    private String cuisine;
    private String dollarSigns;

    public long getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(long restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getDollarSigns() {
        return dollarSigns;
    }

    public void setDollarSigns(String dollarSigns) {
        this.dollarSigns = dollarSigns;
    }
}
