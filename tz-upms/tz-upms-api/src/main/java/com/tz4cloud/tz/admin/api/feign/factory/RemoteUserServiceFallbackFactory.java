package com.tz4cloud.tz.admin.api.feign.factory;

import com.tz4cloud.tz.admin.api.feign.fallback.RemoteUserServiceFallbackImpl;
import com.tz4cloud.tz.admin.api.feign.RemoteUserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author tz
 * @date 2019/2/1
 */
@Component
public class RemoteUserServiceFallbackFactory implements FallbackFactory<RemoteUserService> {

	@Override
	public RemoteUserService create(Throwable throwable) {
		RemoteUserServiceFallbackImpl remoteUserServiceFallback = new RemoteUserServiceFallbackImpl();
		remoteUserServiceFallback.setCause(throwable);
		return remoteUserServiceFallback;
	}
}
