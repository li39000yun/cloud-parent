package com.tz4cloud.tz.admin.api.feign.factory;

import com.tz4cloud.tz.admin.api.feign.fallback.RemoteLogServiceFallbackImpl;
import com.tz4cloud.tz.admin.api.feign.RemoteLogService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author tz
 * @date 2019/2/1
 */
@Component
public class RemoteLogServiceFallbackFactory implements FallbackFactory<RemoteLogService> {

	@Override
	public RemoteLogService create(Throwable throwable) {
		RemoteLogServiceFallbackImpl remoteLogServiceFallback = new RemoteLogServiceFallbackImpl();
		remoteLogServiceFallback.setCause(throwable);
		return remoteLogServiceFallback;
	}
}
