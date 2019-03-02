/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the Tz4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */
package com.tz4cloud.tz.dbquery.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tz4cloud.tz.common.core.util.R;
import com.tz4cloud.tz.common.log.annotation.SysLog;
import com.tz4cloud.tz.dbquery.api.entity.BaseDb;
import com.tz4cloud.tz.dbquery.service.BaseDbService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * 数据库配置
 *
 * @author liyunqiang
 * @date 2019-03-02 14:15:47
 */
@RestController
@AllArgsConstructor
@RequestMapping("/basedb")
public class BaseDbController {

  private final BaseDbService baseDbService;

  /**
   * 简单分页查询
   * @param page 分页对象
   * @param baseDb 数据库配置
   * @return
   */
  @GetMapping("/page")
  public R<IPage<BaseDb>> getBaseDbPage(Page<BaseDb> page, BaseDb baseDb) {
    return  new R<>(baseDbService.getBaseDbPage(page,baseDb));
  }


  /**
   * 通过id查询单条记录
   * @param id
   * @return R
   */
  @GetMapping("/{id}")
  public R<BaseDb> getById(@PathVariable("id") Integer id){
    return new R<>(baseDbService.getById(id));
  }

  /**
   * 新增记录
   * @param baseDb
   * @return R
   */
  @SysLog("新增数据库配置")
  @PostMapping
  @PreAuthorize("@pms.hasPermission('generator_basedb_add')")
  public R save(@RequestBody BaseDb baseDb){
    return new R<>(baseDbService.save(baseDb));
  }

  /**
   * 修改记录
   * @param baseDb
   * @return R
   */
  @SysLog("修改数据库配置")
  @PutMapping
  @PreAuthorize("@pms.hasPermission('generator_basedb_edit')")
  public R update(@RequestBody BaseDb baseDb){
    return new R<>(baseDbService.updateById(baseDb));
  }

  /**
   * 通过id删除一条记录
   * @param id
   * @return R
   */
  @SysLog("删除数据库配置")
  @DeleteMapping("/{id}")
  @PreAuthorize("@pms.hasPermission('generator_basedb_del')")
  public R removeById(@PathVariable Integer id){
    return new R<>(baseDbService.removeById(id));
  }

}
