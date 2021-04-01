package com;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 生产者
 * @Author: QiuQiang
 * @Date: 2021-04-01
 */
@SpringBootApplication
@EnableDubbo
@EnableDubboConfiguration
@DubboComponentScan
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        // dubbo脱离web容器独立运行
        /*SpringApplication app = new SpringApplication(ProviderApplication.class);
        app.run(args);
        Main.main(args);*/
    }


}