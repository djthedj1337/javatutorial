package com.jin.restaurantguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuideDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuideDemoApplication.class, args);
    }
}

//MySQL cmd DBA manually used to create schema to migrate
//postman/online services used to retrieve data and update , not used to create tables
//JDBC is a client side library/protocol how to contact JDBC server aka mySQL server/Oracle


