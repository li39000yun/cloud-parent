package com.tz4cloud.tz.codegen;

import com.tz4cloud.tz.common.security.annotation.EnableTzFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author tz
 * @date 2019/2/1
 * 代码生成模块
 */
@SpringCloudApplication
@EnableTzFeignClients
public class TzCodeGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TzCodeGenApplication.class, args);
	}
}
