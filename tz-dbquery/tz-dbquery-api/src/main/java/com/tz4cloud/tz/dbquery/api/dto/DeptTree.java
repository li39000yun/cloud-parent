package com.tz4cloud.tz.dbquery.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author tz
 * @date 2019/2/1
 * 部门树
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeptTree extends TreeNode {
	private String name;
}
