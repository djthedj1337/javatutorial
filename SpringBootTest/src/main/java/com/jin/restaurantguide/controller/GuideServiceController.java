package com.jin.restaurantguide.controller;

import com.jin.restaurantguide.model.Location;
import com.jin.restaurantguide.model.Restaurant;
import com.jin.search.model.Customer;
import com.jin.search.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GuideServiceController {
    private static Map<Long, Location> locationRepo = new HashMap<>();
    private static Map<Long, Restaurant> restaurantRepo = new HashMap<>();

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

    @RequestMapping(value = "/restaurants/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
        restaurantRepo.remove(id);
        return new ResponseEntity<>("Restaurant " + restaurantRepo.get(id).getRestaurantName() + " has been deleted successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/restaurants/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateRestaurant(@PathVariable("id") Long id, @RequestBody Restaurant restaurant) {
        restaurantRepo.remove(id);
        restaurant.setRestaurantID(id);
        restaurantRepo.put(id, restaurant);
        return new ResponseEntity<>("Restaurant " + restaurantRepo.get(id).getRestaurantName() + " has been updated successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/restaurants", method = RequestMethod.POST)
    public ResponseEntity<Object> createRestaurant(@RequestBody Restaurant restaurant) {
        restaurantRepo.put(restaurant.getRestaurantID(), restaurant);
        return new ResponseEntity<>("Restaurant " + restaurant.getRestaurantName() + " has been created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    public ResponseEntity<Object> getRestaurant() {
        //int x = 1/0; to create exception
        return new ResponseEntity<>(restaurantRepo.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/locations/{locationID}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteLocation(@PathVariable("customerID") Long locationID) {
        locationRepo.remove(locationID);
        return new ResponseEntity<>("Location " + locationRepo.get(locationID).getLocationCityState() + " has been deleted successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/locations/{locationID}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateLocation(@PathVariable("locationID") Long locationID, @RequestBody Location location) {
        locationRepo.remove(locationID);
        locationRepo.put(locationID, location);
        return new ResponseEntity<>("Location " + location.getLocationCityState() + " has updated successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/locations/{locationID}/rankings", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateLocationRankings(@PathVariable("locationID") Long locationID, @RequestParam Long restaurantID, @RequestParam Double ranking) {
        locationRepo.get(locationID).addRankings(restaurantID, ranking);
        return new ResponseEntity<>("Location Rankings has updated successfully", HttpStatus.OK);
    }


    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public ResponseEntity<Object> createLocation(@RequestBody Location location) {
        locationRepo.put(location.getLocationID(), location);
        return new ResponseEntity<>("Location has been created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/locations", method = RequestMethod.GET)
    public ResponseEntity<Object> getLocation() {
        return new ResponseEntity<>(locationRepo.values(), HttpStatus.OK);
    }
}




