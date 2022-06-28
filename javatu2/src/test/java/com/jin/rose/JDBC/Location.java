package com.jin.rose.JDBC;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private long locationID;
    private String locationName;
    private String locationState;
    private Map<Long, Double> rankings = new HashMap<>();


    public Location(long locationID, String locationName, String locationState){
        this.locationID = locationID;
        this.locationName = locationName;
        this.locationState = locationState;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationState() {
        return locationState;
    }

    public void setLocationState(String locationState) {
        this.locationState = locationState;
    }


    public long getLocationID() {
        return locationID;
    }

    public void setLocationID(long locationID) {
        this.locationID = locationID;
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
