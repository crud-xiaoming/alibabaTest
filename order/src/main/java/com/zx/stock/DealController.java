package com.zx.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("deal")
public class DealController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("addstock")
    public void dealStock() {

        String url = "http://stock-servicer/stock/add";
        restTemplate.getForEntity(url, null);
    }

    @RequestMapping("testorder")
    public void testOrder() {

        System.out.println("进入测试方法testorder");
    }
}
