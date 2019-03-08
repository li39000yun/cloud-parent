package com.tz4cloud.tz.dbquery.api.feign.factory;

import com.tz4cloud.tz.dbquery.api.feign.RemoteBaseDbService;
import com.tz4cloud.tz.dbquery.api.feign.fallback.RemoteBaseDbServiceFallbackImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 数据库配置工厂类
 *
 * @author liyunqiang
 * @date 2019/3/5 18:46
 */
@Component
public class RemoteBaseDbServiceFallbackFactory implements FallbackFactory<RemoteBaseDbService> {
    @Override
    public RemoteBaseDbService create(Throwable throwable) {
        RemoteBaseDbServiceFallbackImpl remoteBaseDbServiceFallback = new RemoteBaseDbServiceFallbackImpl();
        remoteBaseDbServiceFallback.setCaues(throwable);
        return remoteBaseDbServiceFallback;
    }
}
