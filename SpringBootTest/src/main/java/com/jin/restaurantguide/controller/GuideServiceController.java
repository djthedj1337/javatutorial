package com.jin.restaurantguide.controller;

import com.jin.restaurantguide.model.Location;
import com.jin.restaurantguide.model.Restaurant;
import com.jin.search.model.Customer;
import com.jin.search.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

import java.sql.*;

@RestController
public class GuideServiceController {
    /*
}
    private static Map<Long, Location> locationRepo = new HashMap<>();
    private static Map<Long, Restaurant> restaurantRepo = new HashMap<>();
/*
    static {
        Restaurant sideshowKitchen = new Restaurant();
        sideshowKitchen.setRestaurantID(1);
        sideshowKitchen.setRestaurantName("Sideshow Kitchen");
        sideshowKitchen.setCuisine("American");
        sideshowKitchen.setDollarSigns("$$");
        restaurantRepo.put(sideshowKitchen.getRestaurantID(), sideshowKitchen);

        Restaurant zacharys = new Restaurant();
        zacharys.setRestaurantID(2);
        zacharys.setRestaurantName("Zachary's Chicago Pizza Oakland");
        zacharys.setCuisine("Italian");
        zacharys.setDollarSigns("$$");
        restaurantRepo.put(zacharys.getRestaurantID(), zacharys);


        Restaurant hopR = new Restaurant();
        hopR.setRestaurantID(3);
        hopR.setRestaurantName("House of Prime Rib");
        hopR.setCuisine("American");
        hopR.setDollarSigns("$$$");
        restaurantRepo.put(hopR.getRestaurantID(), hopR);


        Restaurant camptonPlace = new Restaurant();
        camptonPlace.setRestaurantID(4);
        camptonPlace.setRestaurantName("Campton Place");
        camptonPlace.setCuisine("South Indian/French");
        camptonPlace.setDollarSigns("$$$$");
        restaurantRepo.put(camptonPlace.getRestaurantID(), camptonPlace);


        Restaurant kru = new Restaurant();
        kru.setRestaurantID(5);
        kru.setRestaurantName("Kru Contemporary Japanese Cuisine");
        kru.setCuisine("Japanese");
        kru.setDollarSigns("$$$");
        restaurantRepo.put(kru.getRestaurantID(), kru);


        Restaurant baconAndButter = new Restaurant();
        baconAndButter.setRestaurantID(6);
        baconAndButter.setRestaurantName("Bacon and Butter");
        baconAndButter.setCuisine("American");
        baconAndButter.setDollarSigns("$$");
        restaurantRepo.put(baconAndButter.getRestaurantID(), baconAndButter);

        Location sanFrancisco = new Location();
        sanFrancisco.setLocationID(1);
        sanFrancisco.setLocationCityState("San Francisco, CA");
        locationRepo.put(sanFrancisco.getLocationID(), sanFrancisco);

        Location oakland = new Location();
        oakland.setLocationID(2);
        oakland.setLocationCityState("Oakland,CA");
        locationRepo.put(oakland.getLocationID(), oakland);

        Location sacramento = new Location();
        sacramento.setLocationID(3);
        sacramento.setLocationCityState("Sacramento, CA");
        locationRepo.put(sacramento.getLocationID(), sacramento);
        System.out.println("Location Map: " + locationRepo);

    }
    */


    @RequestMapping(value = "/restaurants/{restaurantID}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("restaurantID") Integer restaurantID) {
        //restaurantRepo.remove(id);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("delete from Restaurants where RestaurantID =" + restaurantID);
        } catch(Exception e){ System.out.println(e);}
        return new ResponseEntity<>("Restaurant has been deleted successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/restaurants/{restaurantID}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateRestaurant(@PathVariable("restaurantID") Integer restaurantID, @RequestParam String restaurantName, @RequestParam String cuisine, @RequestParam String dollarSigns) {
        // restaurantRepo.remove(id);
        //restaurant.setRestaurantID(id);
        //restaurantRepo.put(id, restaurant);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("update Restaurants set RestaurantName = " + restaurantName + ", Cuisine = " + cuisine + ", DollarSigns = " + dollarSigns+ " where RestaurantID =" + restaurantID);
        } catch(Exception e){ System.out.println(e);}


        return new ResponseEntity<>("Restaurant has been updated successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/restaurants", method = RequestMethod.POST)
    public ResponseEntity<Object> createRestaurant(@RequestParam Integer restaurantID, @RequestParam String restaurantName, @RequestParam String cuisine, @RequestParam String dollarSigns) {
        //restaurantRepo.put(restaurant.getRestaurantID(), restaurant);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("insert into Restaurants value(" + restaurantID + ", " + restaurantName + ", " + cuisine + ", " + dollarSigns + ")");

        } catch(Exception e){ System.out.println(e);}
        return new ResponseEntity<>("Restaurant has been created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    public ResponseEntity<Object> getRestaurants() {
        //int x = 1/0; to create exception
        Map<Integer ,String> restaurants = new HashMap<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select * from Restaurants");
            while(rs.next())
                restaurants.put(rs.getInt(1), rs.getInt(1)+", "+ rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
            con.close();

        } catch(Exception e){ System.out.println(e);}
        return new ResponseEntity<>(restaurants.values() ,HttpStatus.OK);
    }

    @RequestMapping(value = "/locations/{locationID}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteLocation(@PathVariable("locationID") Integer locationID) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("delete from Locations where LocationID =" + locationID);
            con.close();

        } catch(Exception e){ System.out.println(e);}
        return new ResponseEntity<>("Location has been deleted successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/locations/{locationID}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateLocation(@PathVariable("locationID") Integer locationID, @RequestParam String locationName, @RequestParam String locationState) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("update Locations set LocationName =" + locationName + ", LocationState =" + locationState + "where LocationID =" + locationID);
            con.close();

        } catch(Exception e){ System.out.println(e);}
        return new ResponseEntity<>("Location has updated successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/rankings/{restaurantID}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateRankings(@PathVariable("restaurantID") Integer restaurantID, @RequestParam Double ranking) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("update Rankings set Ranking =" + ranking + "where RestaurantID =" + restaurantID);
            con.close();

        } catch(Exception e){ System.out.println(e);}

        return new ResponseEntity<>("Location Rankings has updated successfully", HttpStatus.OK);
    }


    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public ResponseEntity<Object> createLocation(@RequestParam Integer locationID, @RequestParam String locationName, @RequestParam String locationState) {
        //locationRepo.put(location.getLocationID(), location);
        //System.out.println("Outside try catch");

        try{
            System.out.println("Inside try catch");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("insert into Locations values (" + locationID + "," + locationName + "," + locationState + ")");
            con.close();

        } catch(Exception e){ System.out.println(e);}
        //System.out.println("Finished try catch");

        return new ResponseEntity<>("Location has been created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/locations", method = RequestMethod.GET)
    public ResponseEntity<Object> getLocations() {
        Map<Integer ,String> locations = new HashMap<>();
        System.out.println("Check check");

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from Locations");
            while(rs.next()){
                locations.put(rs.getInt(1), rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();

        } catch(Exception e){ System.out.println(e);}

        return new ResponseEntity<>(locations.values(), HttpStatus.OK);


    }
}




