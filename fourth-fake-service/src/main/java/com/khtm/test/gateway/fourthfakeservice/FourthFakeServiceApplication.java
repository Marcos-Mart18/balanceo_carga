package com.khtm.test.gateway.fourthfakeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class FourthFakeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FourthFakeServiceApplication.class, args);
    }

}
