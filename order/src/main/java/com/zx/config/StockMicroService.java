package com.zx.config;

import com.zx.bean.StockBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-servicer", configuration = FeignClientConfig.class, contextId = "stock")
public interface StockMicroService {


    @RequestMapping("/stock/addstock")
    String addstock(@RequestBody StockBean woParam);

}
