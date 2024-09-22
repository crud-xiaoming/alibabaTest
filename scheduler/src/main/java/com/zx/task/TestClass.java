package com.zx.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TestClass {

    @Scheduled(fixedRate = 5000)
    public void execute(){

        System.out.println("====每5秒执行一次===任务====");


    }


    public static void main(String[] args) {
        System.out.println("===ok====");
    }
}
