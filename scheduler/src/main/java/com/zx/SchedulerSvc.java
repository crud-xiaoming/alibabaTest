package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SchedulerSvc {

    public static void main(String[] args) {
        System.out.println("====start=====");
        SpringApplication.run(SchedulerSvc.class, args);
        System.out.println("====end=====");
    }
}
