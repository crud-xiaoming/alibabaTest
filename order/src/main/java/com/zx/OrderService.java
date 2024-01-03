package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderService {

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(OrderService.class, args);
//       while (true){
        String userStr = application.getEnvironment().getProperty("user");
        System.out.println("userStr:" + userStr);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//       }
    }


}
