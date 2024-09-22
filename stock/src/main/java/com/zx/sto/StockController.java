package com.zx.sto;

import com.zx.bean.StockBean;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("stock")
public class StockController {

    @Autowired
    StockServer stockSvc;

    @RequestMapping("add")
    public void add() {
        System.out.println("=====进入add方法=====");
    }


    @RequestMapping("addstock")
    public String addstock(StockBean stockBean) {
        System.out.println("=====进入addstock方法=====");
        System.out.println("=====addstock方法结束=====");
        return stockBean.getName();

    }

    @RequestMapping("querylist")
    public List<IStockDao> queryList(){
        List<IStockDao>  list = stockSvc.queryList();
        System.out.println("=========querylist=========");
        System.out.println("查询数据个数");
        return list;
    }
}
