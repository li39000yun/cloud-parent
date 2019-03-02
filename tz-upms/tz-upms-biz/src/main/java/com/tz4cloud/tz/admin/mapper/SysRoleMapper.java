package com.tz4cloud.tz.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tz4cloud.tz.admin.api.entity.SysRole;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author tz
 * @since 2019/2/1
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {
	/**
	 * 通过用户ID，查询角色信息
	 *
	 * @param userId
	 * @return
	 */
	List<SysRole> listRolesByUserId(Integer userId);
}
