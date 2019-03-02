package com.tz4cloud.tz.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tz4cloud.tz.admin.api.entity.SysOauthClientDetails;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author tz
 * @since 2019/2/1
 */
public interface SysOauthClientDetailsService extends IService<SysOauthClientDetails> {
	/**
	 * 通过ID删除客户端
	 *
	 * @param id
	 * @return
	 */
	Boolean removeClientDetailsById(String id);

	/**
	 * 根据客户端信息
	 *
	 * @param sysOauthClientDetails
	 * @return
	 */
	Boolean updateClientDetailsById(SysOauthClientDetails sysOauthClientDetails);
}
