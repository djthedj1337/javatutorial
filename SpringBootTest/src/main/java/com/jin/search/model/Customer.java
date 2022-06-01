package com.jin.search.model;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private long customerID;
    private String customerName;
    private Map<Long, Integer> purchases = new HashMap<>();

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public Map<Long, Integer> getPurchases() {
        return purchases;
    }

    public void addPurchase(Long productID, Integer quantity){
        if(!purchases.containsKey(productID)) {
            purchases.put(productID, quantity);
        }else{
            purchases.replace(productID, purchases.get(productID) + quantity);
        }
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


}



