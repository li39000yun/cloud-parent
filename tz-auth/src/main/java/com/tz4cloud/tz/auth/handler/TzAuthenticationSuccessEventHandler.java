package com.tz4cloud.tz.auth.handler;

import com.tz4cloud.tz.common.security.handler.AuthenticationSuccessEventHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 * @author tz
 * @date 2019/2/1
 */
@Slf4j
@Component
public class TzAuthenticationSuccessEventHandler extends AuthenticationSuccessEventHandler {

	/**
	 * 处理登录成功方法
	 * <p>
	 * 获取到登录的authentication 对象
	 *
	 * @param authentication 登录对象
	 */
	@Override
	public void handle(Authentication authentication) {
		log.info("用户：{} 登录成功", authentication.getPrincipal());
	}
}
