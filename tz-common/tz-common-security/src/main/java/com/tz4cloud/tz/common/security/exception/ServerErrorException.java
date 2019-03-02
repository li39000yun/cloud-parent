

package com.tz4cloud.tz.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tz4cloud.tz.common.security.component.TzAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author tz
 * @date 2019/2/1
 */
@JsonSerialize(using = TzAuth2ExceptionSerializer.class)
public class ServerErrorException extends TzAuth2Exception {

	public ServerErrorException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "server_error";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.INTERNAL_SERVER_ERROR.value();
	}

}
