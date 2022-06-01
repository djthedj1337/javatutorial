package com.jin.search.controller;

import java.util.HashMap;
import java.util.Map;

import com.jin.search.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jin.search.model.Product;

@RestController
public class ProductServiceController {
    private static Map<Long, Product> productRepo = new HashMap<>();
    private static Map<Long, Customer> customerRepo = new HashMap<>();

    static {

        Product backScratcher = new Product();
        backScratcher.setProductID(1);
        backScratcher.setProductName("Back Scratcher");
        productRepo.put(backScratcher.getProductID(), backScratcher);

        Product coldBrew = new Product();
        coldBrew.setProductID(2);
        coldBrew.setProductName("Cold Brew");
        productRepo.put(coldBrew.getProductID(), coldBrew);

        Customer george = new Customer();
        george.setCustomerName("George");
        george.setCustomerID(1111);
        george.addPurchase(backScratcher.getProductID(), 2);
        george.addPurchase(coldBrew.getProductID(), 0);
        customerRepo.put(george.getCustomerID(), george);

        Customer david = new Customer();
        david.setCustomerName("David");
        david.setCustomerID(2222);
        david.addPurchase(backScratcher.getProductID(), 1);
        david.addPurchase(coldBrew.getProductID(), 3);
        customerRepo.put(david.getCustomerID(), david);


    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
        productRepo.remove(id);
        return new ResponseEntity<>("Product has been deleted successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        productRepo.remove(id);
        product.setProductID(id);
        productRepo.put(id, product);
        return new ResponseEntity<>("Product has been updated successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productRepo.put(product.getProductID(), product);
        return new ResponseEntity<>("Product has been created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProduct() {
        //int x = 1/0; to create exception
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/customers/{customerID}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteCustomer(@PathVariable("customerID") Long customerID) {
        customerRepo.remove(customerID);
        return new ResponseEntity<>("Customer has been deleted successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/customers/{customerID}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateCustomer(@PathVariable("customerID") Long customerID, @RequestBody Customer customer) {
        customerRepo.remove(customerID);
        customerRepo.put(customerID, customer);
        return new ResponseEntity<>("Customer has updated successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/customers/{customerID}/purchases", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateCustomerPurchases(@PathVariable("customerID") Long customerID, @RequestParam Long productID, @RequestParam Integer quantity){
        customerRepo.get(customerID).addPurchase(productID, quantity);
        return new ResponseEntity<>("Customer Purchases has updated successfully", HttpStatus.OK);
    }


    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public ResponseEntity<Object> createCustomer(@RequestBody Customer customer) {
        customerRepo.put(customer.getCustomerID(), customer);
        return new ResponseEntity<>("Customer has been created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/customers")
    public ResponseEntity<Object> getCustomer() {
        return new ResponseEntity<>(customerRepo.values(), HttpStatus.OK);
    }
}


