package com.zx.config;

import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {
    //连接超时时间
    @Value("${client.feign.connectTimeout:10000}")
    private int connectTimeout;

    //读取超时时间
    @Value("${client.feign.readTimeOut:10000}")
    private int readTimeout;


    @Bean
    public Request.Options options() {
        return new Request.Options(connectTimeout, readTimeout);
    }

    @Bean
    public Retryer feignRetryer() {

        return Retryer.NEVER_RETRY;
    }

    /**
     * 日志级别
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
