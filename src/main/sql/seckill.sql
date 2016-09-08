/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : seckill

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2016-09-08 18:04:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seckill
-- ----------------------------
DROP TABLE IF EXISTS `seckill`;
CREATE TABLE `seckill` (
  `seckill_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
  `name` varchar(120) NOT NULL COMMENT '商品名称',
  `number` int(11) NOT NULL COMMENT '库存数量',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `start_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '秒杀开启时间',
  `end_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '秒杀结束时间',
  PRIMARY KEY (`seckill_id`),
  KEY `idx_start_time` (`start_time`),
  KEY `idx_end_time` (`end_time`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8 COMMENT='描述库存表';

-- ----------------------------
-- Records of seckill
-- ----------------------------
INSERT INTO `seckill` VALUES ('1000', '1000元秒杀iphone6', '93', '2016-07-18 16:01:24', '2016-09-09 00:00:00', '2016-10-19 00:00:00');
INSERT INTO `seckill` VALUES ('1001', '500元秒杀ipad2', '199', '2016-07-18 16:01:24', '2016-07-18 00:00:00', '2016-10-19 00:00:00');
INSERT INTO `seckill` VALUES ('1002', '300元秒杀小米4', '300', '2016-07-18 16:01:24', '2016-07-18 00:00:00', '2016-10-19 00:00:00');
INSERT INTO `seckill` VALUES ('1003', '200元秒杀红米note', '400', '2016-07-18 16:01:24', '2016-07-18 00:00:00', '2016-10-19 00:00:00');

-- ----------------------------
-- Table structure for success_killed
-- ----------------------------
DROP TABLE IF EXISTS `success_killed`;
CREATE TABLE `success_killed` (
  `seckill_id` bigint(20) NOT NULL COMMENT '商品库存id',
  `user_phone` bigint(20) NOT NULL COMMENT '用户手机号码',
  `state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '状态：-1：无效 0：成功 1：已付款',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`seckill_id`,`user_phone`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='描述库存表';

-- ----------------------------
-- Records of success_killed
-- ----------------------------
INSERT INTO `success_killed` VALUES ('1000', '15258867287', '0', '2016-09-08 17:05:15');
INSERT INTO `success_killed` VALUES ('1000', '15868885684', '0', '2016-09-08 16:38:46');
INSERT INTO `success_killed` VALUES ('1000', '15888888888', '0', '2016-09-08 17:09:30');
INSERT INTO `success_killed` VALUES ('1001', '15868885684', '0', '2016-09-01 16:10:58');
INSERT INTO `success_killed` VALUES ('1001', '15888888888', '0', '2016-09-08 17:57:57');
