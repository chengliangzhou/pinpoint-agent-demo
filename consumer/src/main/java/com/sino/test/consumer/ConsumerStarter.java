package com.sino.test.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhouchengliang
 * @description 消费者启动类
 * 注意：直接使用引入的jar包中的feign客户端需要配置扫描外部jar包路径，
 * 否则会因为spring启动类默认扫描不到，报bean找不到错误
 * @date 2019-09-09
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.sino.common.service"})
public class ConsumerStarter {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStarter.class, args);
    }
}
