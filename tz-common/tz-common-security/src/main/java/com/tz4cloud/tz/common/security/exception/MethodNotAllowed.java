

package com.tz4cloud.tz.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tz4cloud.tz.common.security.component.TzAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author tz
 * @date 2019/2/1
 */
@JsonSerialize(using = TzAuth2ExceptionSerializer.class)
public class MethodNotAllowed extends TzAuth2Exception {

	public MethodNotAllowed(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "method_not_allowed";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.METHOD_NOT_ALLOWED.value();
	}

}
