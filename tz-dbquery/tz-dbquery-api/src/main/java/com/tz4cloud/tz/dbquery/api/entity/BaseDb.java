package com.tz4cloud.tz.dbquery.api.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 数据库配置
 *
 * @author liyunqiang
 * @date 2019-03-02 14:15:47
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("base_db")
public class BaseDb extends Model<BaseDb> {
private static final long serialVersionUID = 1L;

    /**
   * 主键
   */
    @TableId
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
