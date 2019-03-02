package com.tz4cloud.tz.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 *
 * @author liyunqiang
 * @date 2019/2/26 11:15
 */
@EnableConfigServer
@SpringCloudApplication
public class TzConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TzConfigApplication.class, args);
    }

}
