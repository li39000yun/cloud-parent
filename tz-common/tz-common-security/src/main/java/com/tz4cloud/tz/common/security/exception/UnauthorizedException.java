

package com.tz4cloud.tz.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tz4cloud.tz.common.security.component.TzAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author tz
 * @date 2019/2/1
 */
@JsonSerialize(using = TzAuth2ExceptionSerializer.class)
public class UnauthorizedException extends TzAuth2Exception {

	public UnauthorizedException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "unauthorized";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.UNAUTHORIZED.value();
	}

}
