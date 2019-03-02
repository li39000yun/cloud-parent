package com.tz4cloud.tz.dbquery.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 数据库配置
 * </p>
 *
 * @author liyunqiang
 * @since 2019-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseDb extends Model<BaseDb> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 系统代码
     */
    private String sysCode;

    /**
     * 系统名称
     */
    private String sysName;

    /**
     * 类型
     */
    private String type;

    /**
     * 服务器地址
     */
    private String address;

    /**
     * 端口
     */
    private String port;

    /**
     * 库名
     */
    private String dbName;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 数据库说明
     */
    private String remark;

    /**
     * 顺序
     */
    private Integer sequence;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建人
     */
    private String createName;

    /**
     * 创建时间
     */
    private String createTime;

}
