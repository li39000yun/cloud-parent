package com.tz4cloud.tz.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liyunqiang
 * @date 2019年02月26日
 * 服务中心
 */
@EnableEurekaServer
@SpringBootApplication
public class TzEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TzEurekaApplication.class, args);
    }

}
