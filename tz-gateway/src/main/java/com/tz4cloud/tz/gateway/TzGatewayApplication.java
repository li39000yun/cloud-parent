package com.tz4cloud.tz.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;


/**
 *网关应用
 *@author liyunqiang
 *@date 2019/2/26 15:10
 */
@SpringCloudApplication
public class TzGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TzGatewayApplication.class, args);
    }

}
