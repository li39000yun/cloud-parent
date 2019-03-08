package com.tz4cloud.tz.dbquery.api.feign;

import com.tz4cloud.tz.common.core.constant.ServiceNameConstants;
import com.tz4cloud.tz.common.core.util.R;
import com.tz4cloud.tz.dbquery.api.feign.factory.RemoteBaseDbServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = ServiceNameConstants.DBQUERY_SERVICE, fallbackFactory = RemoteBaseDbServiceFallbackFactory.class)
public interface RemoteBaseDbService {

    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/basedb/list")
    R list();

}
