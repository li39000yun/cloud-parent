package com.tz4cloud.tz.codegen.entity;

import lombok.Data;

import java.util.List;

/**
 * @author tz
 * @date 2019/2/1
 * 表属性： https://blog.csdn.net/lkforce/article/details/79557482
 */
@Data
public class TableEntity {
	/**
	 * 名称
	 */
	private String tableName;
	/**
	 * 备注
	 */
	private String comments;
	/**
	 * 主键
	 */
	private ColumnEntity pk;
	/**
	 * 列名
	 */
	private List<ColumnEntity> columns;
	/**
	 * 驼峰类型
	 */
	private String caseClassName;
	/**
	 * 普通类型
	 */
	private String lowerClassName;
}