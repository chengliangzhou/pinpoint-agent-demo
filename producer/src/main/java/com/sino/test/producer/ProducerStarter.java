package com.sino.test.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouchengliang
 * @description 生产者启动类
 * @date 2019-09-09
 **/
@SpringBootApplication
@EnableEurekaClient
public class ProducerStarter {
    public static void main(String[] args) {
        SpringApplication.run(ProducerStarter.class, args);
    }
}
