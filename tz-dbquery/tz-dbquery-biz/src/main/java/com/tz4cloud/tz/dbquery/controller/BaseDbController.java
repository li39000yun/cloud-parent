package com.tz4cloud.tz.dbquery.controller;


import com.tz4cloud.tz.common.core.util.R;
import com.tz4cloud.tz.dbquery.service.BaseDbService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 数据库配置 前端控制器
 * </p>
 *
 * @author liyunqiang
 * @since 2019-02-27
 */
@RestController
@AllArgsConstructor
@RequestMapping("/baseDb")
public class BaseDbController {

    private final BaseDbService baseDbService;

    /**
     * 查询所有记录
     * @return
     */
    @GetMapping(value = "/list")
    public R list() {
        return new R<>(baseDbService.list());
    }

}

