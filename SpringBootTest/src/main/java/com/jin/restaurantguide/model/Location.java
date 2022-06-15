package com.jin.restaurantguide.model;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private long locationID;
    private String locationCityState;
    private Map<Long, Double> rankings = new HashMap<>();

    @Override
    public String toString(){
        return "This location's information: " + locationID + ", " + locationCityState;
    }


    public long getLocationID() {
        return locationID;
    }

    public void setLocationID(long locationID) {
        this.locationID = locationID;
    }

    public String getLocationCityState() {
        return locationCityState;
    }

    public void setLocationCityState(String locationCityState) {
        this.locationCityState = locationCityState;
    }

    public Map<Long, Double> getRankings() {
        return rankings;
    }

    public void addRankings(Long restaurantID, Double ranking) {
        if(!rankings.containsKey(restaurantID)){
            rankings.put(restaurantID,ranking);
        }
        else{
            rankings.replace(restaurantID,ranking);
        }
    }




}
