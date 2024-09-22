package com.zx.stock;

import com.zx.bean.StockBean;
import com.zx.config.StockMicroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("deal")
public class DealController {

    @Autowired
    RestTemplate restTemplate;


    @Autowired
    StockMicroService stockMicSvc;

    @RequestMapping("addstock")
    public void dealStock() {

        String url = "http://stock-servicer/stock/add";
        restTemplate.getForEntity(url, null);
    }

    @RequestMapping("testorder")
    public String testOrder(@RequestBody StockBean stockBean) {

        System.out.println("进入测试方法testorder");
        String retMsg = stockMicSvc.addstock(stockBean);
        return "返回值："+retMsg;
    }
}
