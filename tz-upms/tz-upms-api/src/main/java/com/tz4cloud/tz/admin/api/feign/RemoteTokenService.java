package com.tz4cloud.tz.admin.api.feign;

import com.tz4cloud.tz.admin.api.feign.factory.RemoteTokenServiceFallbackFactory;
import com.tz4cloud.tz.common.core.constant.SecurityConstants;
import com.tz4cloud.tz.common.core.constant.ServiceNameConstants;
import com.tz4cloud.tz.common.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author tz
 * @date 2019/2/1
 */
@FeignClient(value = ServiceNameConstants.AUTH_SERVICE, fallbackFactory = RemoteTokenServiceFallbackFactory.class)
public interface RemoteTokenService {
	/**
	 * 分页查询token 信息
	 *
	 * @param params 分页参数
	 * @param from   内部调用标志
	 * @return page
	 */
	@PostMapping("/oauth/listToken")
	R selectPage(@RequestBody Map<String, Object> params, @RequestHeader(SecurityConstants.FROM) String from);

	/**
	 * 删除token
	 *
	 * @param token token
	 * @param from  调用标志
	 * @return
	 */
	@DeleteMapping("/oauth/delToken/{token}")
	R<Boolean> deleteTokenById(@PathVariable("token") String token, @RequestHeader(SecurityConstants.FROM) String from);
}
