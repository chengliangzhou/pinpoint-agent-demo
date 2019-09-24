package com.sino.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhouchengliang
 * @description 注册中心启动类
 * @date 2019-09-09
 **/
@SpringBootApplication
@EnableEurekaServer
public class RegistryStarter {
    public static void main(String[] args) {
        SpringApplication.run(RegistryStarter.class, args);
    }
}
