package com.tz4cloud.tz.admin;


import com.tz4cloud.tz.common.security.annotation.EnableTzFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author tz
 * @date 2018年06月21日
 * 用户统一管理系统
 */
@EnableTzFeignClients
@SpringCloudApplication
public class TzAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(TzAdminApplication.class, args);
	}

}
