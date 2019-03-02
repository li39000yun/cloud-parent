package com.tz4cloud.tz.monitor;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tz
 * @date 2018年06月21日
 * 监控中心
 */
@EnableAdminServer
@SpringBootApplication
public class TzMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TzMonitorApplication.class, args);
	}
}
