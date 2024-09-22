package com.zx.sto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServer {

    @Autowired
    IStockDao stockDao;

    public List<IStockDao> queryList(){

        List<IStockDao> list = stockDao.queryList();
        return list;
    }

}
