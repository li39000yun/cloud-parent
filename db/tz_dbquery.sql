/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.220
Source Server Version : 50715
Source Host           : 192.168.1.220:3306
Source Database       : tz_dbquery

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2019-03-05 09:54:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for base_db
-- ----------------------------
DROP TABLE IF EXISTS `base_db`;
CREATE TABLE `base_db` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sys_code` varchar(20) NOT NULL COMMENT '系统代码',
  `sys_name` varchar(50) NOT NULL COMMENT '系统名称',
  `type` varchar(20) DEFAULT NULL COMMENT '类型',
  `address` varchar(20) DEFAULT NULL COMMENT '服务器地址',
  `port` varchar(10) DEFAULT NULL COMMENT '端口',
  `db_name` varchar(20) DEFAULT NULL COMMENT '库名',
  `user_name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `remark` varchar(255) DEFAULT NULL COMMENT '数据库说明',
  `sequence` int(8) DEFAULT NULL COMMENT '顺序',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(20) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='数据库配置';

-- ----------------------------
-- Records of base_db
-- ----------------------------
INSERT INTO `base_db` VALUES ('1', 'UserCenter', '用户中心', 'MYSQL', '192.168.1.220', '3306', 'tz_dbquery', 'root', '测试库', '1000', '2', '管理员', '2019-02-27 20:39:00');
INSERT INTO `base_db` VALUES ('2', 'test', '123', '123', '123', '1', '12', '23', '23', '23', '12', '32', '');
