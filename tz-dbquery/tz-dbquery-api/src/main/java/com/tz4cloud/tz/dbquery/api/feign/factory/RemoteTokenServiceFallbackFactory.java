package com.tz4cloud.tz.dbquery.api.feign.factory;

import com.tz4cloud.tz.dbquery.api.feign.fallback.RemoteTokenServiceFallbackImpl;
import com.tz4cloud.tz.dbquery.api.feign.RemoteTokenService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author tz
 * @date 2019/2/1
 */
@Component
public class RemoteTokenServiceFallbackFactory implements FallbackFactory<RemoteTokenService> {

	@Override
	public RemoteTokenService create(Throwable throwable) {
		RemoteTokenServiceFallbackImpl remoteTokenServiceFallback = new RemoteTokenServiceFallbackImpl();
		remoteTokenServiceFallback.setCause(throwable);
		return remoteTokenServiceFallback;
	}
}
