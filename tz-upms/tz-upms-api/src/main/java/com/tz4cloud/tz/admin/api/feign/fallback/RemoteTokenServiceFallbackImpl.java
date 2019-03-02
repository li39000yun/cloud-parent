package com.tz4cloud.tz.admin.api.feign.fallback;

import com.tz4cloud.tz.admin.api.feign.RemoteTokenService;
import com.tz4cloud.tz.common.core.util.R;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author tz
 * @date 2019/2/1
 * feign token  fallback
 */
@Slf4j
@Component
public class RemoteTokenServiceFallbackImpl implements RemoteTokenService {
	@Setter
	private Throwable cause;

	/**
	 * 分页查询token 信息
	 *
	 * @param params 分页参数
	 * @param from   内部调用标志
	 * @return page
	 */
	@Override
	public R selectPage(Map<String, Object> params, String from) {
		log.error("调用认证中心查询token 失败", cause);
		return null;
	}

	/**
	 * 删除token
	 *
	 *
	 * @param s
	 * @param id
	 * @return
	 */
	@Override
	public R<Boolean> deleteTokenById(String s, String id) {
		log.error("删除token 失败 {}", id, cause);
		return null;
	}
}
