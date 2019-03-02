

package com.tz4cloud.tz.common.log.event;

import com.tz4cloud.tz.admin.api.entity.SysLog;
import org.springframework.context.ApplicationEvent;

/**
 * @author tz
 * 系统日志事件
 */
public class SysLogEvent extends ApplicationEvent {

	public SysLogEvent(SysLog source) {
		super(source);
	}
}
