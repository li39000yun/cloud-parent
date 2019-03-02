package com.tz4cloud.tz.dbquery;


import com.tz4cloud.tz.common.security.annotation.EnableTzFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 *数据库查询系统
 *@author liyunqiang
 *@date 2019/2/27 15:57
 */
@EnableTzFeignClients
@SpringCloudApplication
public class TzDbQueryApplication {
	public static void main(String[] args) {
		SpringApplication.run(TzDbQueryApplication.class, args);
	}

}
