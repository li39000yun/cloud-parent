package com.tz4cloud.tz.dbquery.api.feign.fallback;

import com.tz4cloud.tz.common.core.util.R;
import com.tz4cloud.tz.dbquery.api.feign.RemoteBaseDbService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RemoteBaseDbServiceFallbackImpl implements RemoteBaseDbService {

    @Setter
    private Throwable caues;

    @Override
    public R list() {
        log.error("查询数据库配置记录失败", caues);
        return null;
    }

}
