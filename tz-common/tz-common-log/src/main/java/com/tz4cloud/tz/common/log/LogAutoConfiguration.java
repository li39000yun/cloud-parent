

package com.tz4cloud.tz.common.log;

import com.tz4cloud.tz.admin.api.feign.RemoteLogService;
import com.tz4cloud.tz.common.log.aspect.SysLogAspect;
import com.tz4cloud.tz.common.log.event.SysLogListener;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author tz
 * @date 2019/2/1
 * 日志自动配置
 */
@EnableAsync
@Configuration
@AllArgsConstructor
@ConditionalOnWebApplication
@EnableFeignClients({"com.tz4cloud.tz.admin.api.feign"})
public class LogAutoConfiguration {
	private final RemoteLogService remoteLogService;

	@Bean
	public SysLogListener sysLogListener() {
		return new SysLogListener(remoteLogService);
	}

	@Bean
	public SysLogAspect sysLogAspect() {
		return new SysLogAspect();
	}
}
