/*
Navicat MySQL Data Transfer

Source Server         : love
Source Server Version : 50151
Source Host           : 127.0.0.1:3306
Source Database       : foo

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2017-01-15 16:08:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `publishDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '2', '3', '2016-11-02 20:44:20');
INSERT INTO `book` VALUES ('4', 'hibernate', '10.12', '2016-11-30 14:07:09');
INSERT INTO `book` VALUES ('7', 'hibernate', '10.12', '2016-11-30 14:20:30');
INSERT INTO `book` VALUES ('8', 'hibernate', '10.12', '2016-11-30 14:20:45');
INSERT INTO `book` VALUES ('14', 'hibernate', '10.12', '2016-11-30 14:33:52');
INSERT INTO `book` VALUES ('18', '999', '900', null);
INSERT INTO `book` VALUES ('19', '123213123', '1100', null);
INSERT INTO `book` VALUES ('20', '123213123', '1100', null);
INSERT INTO `book` VALUES ('22', '123213123', '1100', null);
INSERT INTO `book` VALUES ('23', 'hello0.19188965534980085', '0.987048271569317', '2016-11-30 15:52:53');
INSERT INTO `book` VALUES ('24', 'hello0.4116631706260393', '0.120824144615488', '2016-12-04 16:39:56');
INSERT INTO `book` VALUES ('31', 'hello0.6433724824559682', '0.0088202768322041', '2016-12-09 11:40:24');
INSERT INTO `book` VALUES ('32', 'hello0.8672946114915548', '0.201644344927511', '2016-12-09 12:12:56');
INSERT INTO `book` VALUES ('33', 'hello0.9862661848996694', '0.40620867790104', '2016-12-09 12:13:01');
INSERT INTO `book` VALUES ('34', 'hello0.5867058508711914', '0.395901209209456', '2016-12-09 15:41:38');
INSERT INTO `book` VALUES ('35', 'hello0.31556928543242213', '0.097866555346349', '2016-12-09 15:41:56');
