

package com.tz4cloud.tz.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tz4cloud.tz.common.security.component.TzAuth2ExceptionSerializer;
import lombok.Getter;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * @author tz
 * @date 2019/2/1
 * 自定义OAuth2Exception
 */
@JsonSerialize(using = TzAuth2ExceptionSerializer.class)
public class TzAuth2Exception extends OAuth2Exception {
	@Getter
	private String errorCode;

	public TzAuth2Exception(String msg) {
		super(msg);
	}

	public TzAuth2Exception(String msg, String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}
}
