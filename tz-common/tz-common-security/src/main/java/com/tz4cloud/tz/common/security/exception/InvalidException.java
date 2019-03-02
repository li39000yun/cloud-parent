

package com.tz4cloud.tz.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tz4cloud.tz.common.security.component.TzAuth2ExceptionSerializer;

/**
 * @author tz
 * @date 2019/2/1
 */
@JsonSerialize(using = TzAuth2ExceptionSerializer.class)
public class InvalidException extends TzAuth2Exception {

	public InvalidException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "invalid_exception";
	}

	@Override
	public int getHttpErrorCode() {
		return 426;
	}

}
