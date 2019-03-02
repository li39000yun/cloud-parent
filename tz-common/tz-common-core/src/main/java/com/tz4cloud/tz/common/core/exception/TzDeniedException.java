

package com.tz4cloud.tz.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * @author tz
 * @date 2018年06月22日16:22:03
 * 403 授权拒绝
 */
@NoArgsConstructor
public class TzDeniedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public TzDeniedException(String message) {
		super(message);
	}

	public TzDeniedException(Throwable cause) {
		super(cause);
	}

	public TzDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public TzDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
