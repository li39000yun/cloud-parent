

package com.tz4cloud.tz.common.security.component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.tz4cloud.tz.common.core.constant.CommonConstants;
import com.tz4cloud.tz.common.security.exception.TzAuth2Exception;
import lombok.SneakyThrows;

/**
 * @author tz
 * @date 2019/2/1
 * <p>
 * OAuth2 异常格式化
 */
public class TzAuth2ExceptionSerializer extends StdSerializer<TzAuth2Exception> {
	public TzAuth2ExceptionSerializer() {
		super(TzAuth2Exception.class);
	}

	@Override
	@SneakyThrows
	public void serialize(TzAuth2Exception value, JsonGenerator gen, SerializerProvider provider) {
		gen.writeStartObject();
		gen.writeObjectField("code", CommonConstants.FAIL);
		gen.writeStringField("msg", value.getMessage());
		gen.writeStringField("data", value.getErrorCode());
		gen.writeEndObject();
	}
}
