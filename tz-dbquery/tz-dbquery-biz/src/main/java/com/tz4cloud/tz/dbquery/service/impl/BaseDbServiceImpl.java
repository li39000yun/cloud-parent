package com.tz4cloud.tz.dbquery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tz4cloud.tz.dbquery.api.entity.BaseDb;
import com.tz4cloud.tz.dbquery.mapper.BaseDbMapper;
import com.tz4cloud.tz.dbquery.service.BaseDbService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库配置 服务实现类
 * </p>
 *
 * @author liyunqiang
 * @since 2019-02-27
 */
@Service
public class BaseDbServiceImpl extends ServiceImpl<BaseDbMapper, BaseDb> implements BaseDbService {

}
