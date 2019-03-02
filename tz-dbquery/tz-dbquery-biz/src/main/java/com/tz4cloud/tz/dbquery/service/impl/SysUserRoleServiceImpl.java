package com.tz4cloud.tz.dbquery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tz4cloud.tz.dbquery.api.entity.SysUserRole;
import com.tz4cloud.tz.dbquery.mapper.SysUserRoleMapper;
import com.tz4cloud.tz.dbquery.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author tz
 * @since 2019/2/1
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

	/**
	 * 根据用户Id删除该用户的角色关系
	 *
	 * @param userId 用户ID
	 * @return boolean
	 * @author 寻欢·李
	 * @date 2017年12月7日 16:31:38
	 */
	@Override
	public Boolean deleteByUserId(Integer userId) {
		return baseMapper.deleteByUserId(userId);
	}
}
