package com.tz4cloud.tz.auth;


import com.tz4cloud.tz.common.security.annotation.EnableTzFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author tz
 * @date 2018年06月21日
 * 认证授权中心
 */
@SpringCloudApplication
@EnableTzFeignClients
public class TzAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TzAuthApplication.class, args);
    }
}
