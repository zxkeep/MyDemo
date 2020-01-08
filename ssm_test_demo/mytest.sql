/*
Navicat MySQL Data Transfer

Source Server         : localhost3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : mytest

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-18 17:24:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_product`
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `PRO_NAME` varchar(255) DEFAULT NULL,
  `PRO_NUMBER` varchar(255) DEFAULT NULL,
  `PRO_PRICE` int(10) DEFAULT NULL,
  `DESCRPTION` varchar(255) DEFAULT NULL,
  `STATUS` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('2', 'wwww', '', '100', 'asdfghifds', '5');
INSERT INTO `t_product` VALUES ('3', 'wwww', '', '100', 'asdfghifds', '4');
INSERT INTO `t_product` VALUES ('4', 'wwww', '', '100', 'asdfghifds', '3');
INSERT INTO `t_product` VALUES ('5', 'wwww', '', '100', 'asdfghifds', '2');
INSERT INTO `t_product` VALUES ('6', 'wwww', '', '100', 'asdfghifds', '2');
INSERT INTO `t_product` VALUES ('7', 'wwww', '', '100', 'asdfghifds', '2');
INSERT INTO `t_product` VALUES ('8', 'wwww', '', '100', 'asdfghifds', '2');
INSERT INTO `t_product` VALUES ('9', '感冒灵', '20190328', '100', '999感冒灵，疗效快', '1');
INSERT INTO `t_product` VALUES ('10', '感冒灵', '20190328', '100', '999感冒灵，疗效快', '1');
INSERT INTO `t_product` VALUES ('11', '感冒灵', '20190328', '100', '999感冒灵，疗效快', '1');
INSERT INTO `t_product` VALUES ('12', 'keepz', '12306', '1999', 'just for test...', '1');
INSERT INTO `t_product` VALUES ('13', 'keepz1', '12307', '2000', 'just for test...import1', '2');
INSERT INTO `t_product` VALUES ('14', 'keepz2', '12308', '2001', 'just for test...import2', '3');
INSERT INTO `t_product` VALUES ('15', 'keepz3', '12309', '2002', 'just for test...import3', '4');
INSERT INTO `t_product` VALUES ('16', 'keepz4', '12310', '2003', 'just for test...import4', '5');
INSERT INTO `t_product` VALUES ('17', 'keepz5', '12311', '2004', 'just for test...import5', '3');
INSERT INTO `t_product` VALUES ('18', 'keepz6', '12312', '2005', 'just for test...import6', '4');
INSERT INTO `t_product` VALUES ('19', 'keepz7', '12313', '2006', 'just for test...import7', '5');
INSERT INTO `t_product` VALUES ('20', 'keepz7', '12313', '2006', 'just for test...import7', '5');
INSERT INTO `t_product` VALUES ('21', 'keepz8', '12314', '2007', 'just for test...import8', '4');
INSERT INTO `t_product` VALUES ('22', 'keepz9', '12315', '2008', 'just for test...import9', '3');
INSERT INTO `t_product` VALUES ('23', 'keepz10', '12316', '2009', 'just for test...import10', '2');
INSERT INTO `t_product` VALUES ('24', 'keepz11', '12317', '2010', 'just for test...import11', '1');
INSERT INTO `t_product` VALUES ('25', 'keepz12', '12318', '2011', 'just for test...import12', '2');
INSERT INTO `t_product` VALUES ('26', 'keepz13', '12319', '2012', 'just for test...import13', '3');
INSERT INTO `t_product` VALUES ('27', 'keepz14', '12320', '2013', 'just for test...import14', '4');
INSERT INTO `t_product` VALUES ('28', 'keepz15', '12321', '2014', 'just for test...import15', '5');
INSERT INTO `t_product` VALUES ('29', 'keepz16', '12322', '2015', 'just for test...import16', '4');
INSERT INTO `t_product` VALUES ('30', 'keepz17', '12323', '2016', 'just for test...import17', '3');
INSERT INTO `t_product` VALUES ('31', 'keepz18', '12324', '2017', 'just for test...import18', '2');
INSERT INTO `t_product` VALUES ('32', 'keepz19', '12325', '2018', 'just for test...import19', '1');
INSERT INTO `t_product` VALUES ('33', 'keepz20', '12326', '2019', 'just for test...import20', '0');
INSERT INTO `t_product` VALUES ('34', 'keepz7', '12313', '2006', 'just for test...import7', '5');
INSERT INTO `t_product` VALUES ('35', 'keepz8', '12314', '2007', 'just for test...import8', '4');
INSERT INTO `t_product` VALUES ('36', 'keepz9', '12315', '2008', 'just for test...import9', '3');
INSERT INTO `t_product` VALUES ('37', 'keepz10', '12316', '2009', 'just for test...import10', '2');
INSERT INTO `t_product` VALUES ('38', 'keepz11', '12317', '2010', 'just for test...import11', '1');
INSERT INTO `t_product` VALUES ('39', 'keepz12', '12318', '2011', 'just for test...import12', '2');
INSERT INTO `t_product` VALUES ('40', 'keepz13', '12319', '2012', 'just for test...import13', '3');
INSERT INTO `t_product` VALUES ('41', 'keepz14', '12320', '2013', 'just for test...import14', '4');
INSERT INTO `t_product` VALUES ('42', 'keepz15', '12321', '2014', 'just for test...import15', '5');
INSERT INTO `t_product` VALUES ('43', 'keepz16', '12322', '2015', 'just for test...import16', '4');
INSERT INTO `t_product` VALUES ('44', 'keepz17', '12323', '2016', 'just for test...import17', '3');
INSERT INTO `t_product` VALUES ('45', 'keepz18', '12324', '2017', 'just for test...import18', '2');
INSERT INTO `t_product` VALUES ('46', 'keepz19', '12325', '2018', 'just for test...import19', '1');
INSERT INTO `t_product` VALUES ('47', 'keepz20', '12326', '2019', 'just for test...import20', '0');

-- ----------------------------
-- Table structure for `zx_lottery`
-- ----------------------------
DROP TABLE IF EXISTS `zx_lottery`;
CREATE TABLE `zx_lottery` (
  `LOTTERY_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '奖品id',
  `LOTTERY_NAME` varchar(255) DEFAULT NULL COMMENT '奖品名',
  `LOTTERY_PRICE` int(11) DEFAULT NULL COMMENT '奖品价值',
  `DATA_DELETE` int(1) DEFAULT '2' COMMENT '数据是否逻辑删除（1== 是 2==否 默认2）',
  PRIMARY KEY (`LOTTERY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖品表';

-- ----------------------------
-- Records of zx_lottery
-- ----------------------------

-- ----------------------------
-- Table structure for `zx_user`
-- ----------------------------
DROP TABLE IF EXISTS `zx_user`;
CREATE TABLE `zx_user` (
  `USE_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `USE_NAME` varchar(255) DEFAULT NULL COMMENT '用户名字',
  `USE_PHONE` varchar(11) DEFAULT NULL COMMENT '用户手机号',
  `USE_SEX` bit(1) DEFAULT NULL COMMENT '用户性别',
  `USE_AGE` int(3) DEFAULT NULL COMMENT '用户年龄',
  `USE_LOTTERY_NUMBER` varchar(10) DEFAULT NULL COMMENT '用户抽奖号码',
  `DATA_DELETE` int(1) NOT NULL DEFAULT '2' COMMENT '数据是否逻辑删除（1==是  2==否）',
  PRIMARY KEY (`USE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of zx_user
-- ----------------------------

-- ----------------------------
-- Table structure for `zx_user_code_record`
-- ----------------------------
DROP TABLE IF EXISTS `zx_user_code_record`;
CREATE TABLE `zx_user_code_record` (
  `UL_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户抽奖码id',
  `USE_ID` int(11) DEFAULT NULL COMMENT '用户id',
  `USE_WIN_CODE` varchar(11) DEFAULT NULL COMMENT '用户抽奖码',
  PRIMARY KEY (`UL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户抽奖码记录表';

-- ----------------------------
-- Records of zx_user_code_record
-- ----------------------------

-- ----------------------------
-- Table structure for `zx_winning_code`
-- ----------------------------
DROP TABLE IF EXISTS `zx_winning_code`;
CREATE TABLE `zx_winning_code` (
  `WINNING_ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '中奖编号id',
  `WINNING_NUMBER` varchar(10) DEFAULT NULL COMMENT '中奖编码',
  `DATA_DELETE` int(1) DEFAULT '2' COMMENT '数据是否删除（1==是 2==否 默认2）',
  PRIMARY KEY (`WINNING_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='中奖编号表';

-- ----------------------------
-- Records of zx_winning_code
-- ----------------------------
