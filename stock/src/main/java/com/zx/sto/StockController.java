package com.zx.sto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class StockController {

    @RequestMapping("add")
    public void add() {
        System.out.println("=====进入add方法=====");
    }


    @RequestMapping("addstock")
    public void addstock(StockBean stockBean) {
        System.out.println("=====进入addstock方法=====");
        System.out.println("=====addstock方法结束=====");

    }
}
