package com.demoms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
 @EnableDiscoveryClient
public class Fraud {
    public static void main(String[] args) {
        SpringApplication.run(Fraud.class, args);
    }
}