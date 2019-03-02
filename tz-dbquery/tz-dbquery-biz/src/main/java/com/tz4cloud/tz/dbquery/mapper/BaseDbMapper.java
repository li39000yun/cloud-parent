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
package com.tz4cloud.tz.dbquery.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tz4cloud.tz.dbquery.api.entity.BaseDb;
import org.apache.ibatis.annotations.Param;

/**
 * 数据库配置
 *
 * @author liyunqiang
 * @date 2019-03-02 14:15:47
 */
public interface BaseDbMapper extends BaseMapper<BaseDb> {
  /**
    * 数据库配置简单分页查询
    * @param baseDb 数据库配置
    * @return
    */
  IPage<BaseDb> getBaseDbPage(Page page, @Param("baseDb") BaseDb baseDb);


}
