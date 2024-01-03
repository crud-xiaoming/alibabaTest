package com.zx.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-servicer", configuration = FeignClientConfig.class, contextId = "stock")
public interface StockMicroService {


    @RequestMapping("/agapi/partner/savePartner")
    NResult<StockBean> savePartner(@RequestBody StockBean woParam);

}
