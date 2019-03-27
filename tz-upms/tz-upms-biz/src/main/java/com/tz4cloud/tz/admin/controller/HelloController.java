package com.tz4cloud.tz.admin.controller;

import cn.hutool.json.JSONUtil;
import com.tz4cloud.tz.common.core.util.R;
import com.tz4cloud.tz.dbquery.api.feign.RemoteBaseDbService;
import com.tz4cloud.tz.dbquery.api.feign.RemoteTokenService;
import lombok.AllArgsConstructor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/hello")
@EnableFeignClients({"com.tz4cloud.tz.dbquery.api.feign"})
public class HelloController {

    private RemoteTokenService remoteTokenService;
    private RemoteBaseDbService remoteBaseDbService;

    @GetMapping("/query")
    public String query() {
        System.out.println("in===============================");
        R rs = remoteBaseDbService.list();
        System.out.println(JSONUtil.toJsonStr(rs));
        System.out.println("out===============================");
//        return "hello:"+JSONUtil.toJsonStr(rs);
        return JSONUtil.toJsonStr(rs);
    }

}
