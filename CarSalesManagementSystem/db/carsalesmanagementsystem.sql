-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: carsalesmanagementsystem
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `id` int(8) NOT NULL,
  `name` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'A','111111');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `carid` int(8) NOT NULL AUTO_INCREMENT,
  `brand` varchar(25) NOT NULL,
  `model` varchar(25) NOT NULL,
  `price` int(9) NOT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `quantity` int(8) DEFAULT '0',
  PRIMARY KEY (`carid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,'大众','A6',450000,'http://oh1zr9i3e.bkt.clouddn.com/17-6-24/34281527.jpg',3),(2,'大众','帕萨特',130000,'http://oh1zr9i3e.bkt.clouddn.com/17-6-24/59059624.jpg',1),(5,'保时捷','911',1318000,'http://oh1zr9i3e.bkt.clouddn.com/17-6-24/37565402.jpg',0),(7,'宝马','mini',150000,'http://oh1zr9i3e.bkt.clouddn.com/17-6-24/19643831.jpg',0),(8,'奔驰','C200',260000,'http://oh1zr9i3e.bkt.clouddn.com/17-6-24/49601069.jpg',0),(10,'标志','4008',170000,'http://oh1zr9i3e.bkt.clouddn.com/17-6-24/21093439.jpg',1),(11,'宝马','730Li',700000,'http://oh1zr9i3e.bkt.clouddn.com/17-6-24/1523114.jpg',0);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `clientid` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `phonenumber` varchar(11) NOT NULL,
  `address` varchar(100) NOT NULL,
  PRIMARY KEY (`clientid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'B','111111','13303303033','海王星'),(2,'C','111111','13303303035','金星'),(3,'O','111111','13453330058','冥王星'),(5,'M','111111','14501400122','火星');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `detail_sale`
--

DROP TABLE IF EXISTS `detail_sale`;
/*!50001 DROP VIEW IF EXISTS `detail_sale`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `detail_sale` AS SELECT 
 1 AS `sid`,
 1 AS `eid`,
 1 AS `name`,
 1 AS `phonenumber`,
 1 AS `totalnum`,
 1 AS `totalprofit`,
 1 AS `carid`,
 1 AS `brand`,
 1 AS `model`,
 1 AS `price`,
 1 AS `picture`,
 1 AS `quantity`,
 1 AS `profit`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `eid` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `phonenumber` varchar(11) DEFAULT NULL,
  `totalnum` int(15) DEFAULT '0',
  `totalprofit` int(15) DEFAULT '0',
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'D','15505505055',3,30000),(2,'E','15505505056',1,8000),(4,'T','13403418771',1,20000);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase` (
  `pid` int(8) NOT NULL AUTO_INCREMENT,
  `clientid` int(8) NOT NULL,
  `sid` int(8) NOT NULL,
  `purchasedate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`pid`),
  UNIQUE KEY `clientid` (`clientid`,`sid`,`purchasedate`),
  KEY `sid` (`sid`),
  CONSTRAINT `purchase_ibfk_1` FOREIGN KEY (`clientid`) REFERENCES `client` (`clientid`),
  CONSTRAINT `purchase_ibfk_2` FOREIGN KEY (`sid`) REFERENCES `sale` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` VALUES (1,1,1,'2017-06-25 14:45:00'),(11,1,1,'2017-06-29 02:34:27'),(2,2,1,'2017-06-24 14:45:08'),(9,3,2,'2017-06-25 16:00:00'),(12,5,3,'2017-06-29 04:01:11');
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER purchase_trigger



AFTER INSERT ON purchase



FOR EACH ROW



  BEGIN



    UPDATE employee SET totalnum = totalnum + 1 WHERE eid = (SELECT eid FROM sale WHERE sid = NEW.sid);



    UPDATE employee SET totalprofit = totalprofit + (SELECT profit FROM sale WHERE sale.sid = NEW.sid) WHERE 



      eid = (SELECT eid FROM sale WHERE sid = NEW.sid);



    UPDATE car SET quantity= quantity + 1 WHERE carid = (SELECT  carid FROM sale WHERE sale.sid = NEW.sid);



  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER return_trigger



AFTER DELETE ON purchase



FOR EACH ROW



  BEGIN



    UPDATE employee SET totalnum = totalnum - 1 WHERE eid = (SELECT eid FROM sale WHERE sid = OLD.sid);



    UPDATE employee SET totalprofit = totalprofit - (SELECT profit FROM sale WHERE sale.sid = OLD.sid) WHERE



      eid = (SELECT eid FROM sale WHERE sid = OLD.sid);



    UPDATE car SET quantity= quantity - 1 WHERE carid = (SELECT  carid FROM sale WHERE sale.sid = OLD.sid);



  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Temporary view structure for view `purchase_detail`
--

DROP TABLE IF EXISTS `purchase_detail`;
/*!50001 DROP VIEW IF EXISTS `purchase_detail`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `purchase_detail` AS SELECT 
 1 AS `pid`,
 1 AS `clientid`,
 1 AS `cname`,
 1 AS `sid`,
 1 AS `eid`,
 1 AS `ename`,
 1 AS `carid`,
 1 AS `brand`,
 1 AS `model`,
 1 AS `price`,
 1 AS `profit`,
 1 AS `purchasedate`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `sale`
--

DROP TABLE IF EXISTS `sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sale` (
  `sid` int(8) NOT NULL AUTO_INCREMENT,
  `eid` int(8) NOT NULL,
  `carid` int(8) NOT NULL,
  `profit` int(9) NOT NULL,
  PRIMARY KEY (`sid`),
  UNIQUE KEY `eid` (`eid`,`carid`),
  KEY `carid` (`carid`),
  CONSTRAINT `sale_ibfk_1` FOREIGN KEY (`eid`) REFERENCES `employee` (`eid`),
  CONSTRAINT `sale_ibfk_2` FOREIGN KEY (`carid`) REFERENCES `car` (`carid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sale`
--

LOCK TABLES `sale` WRITE;
/*!40000 ALTER TABLE `sale` DISABLE KEYS */;
INSERT INTO `sale` VALUES (1,1,1,10000),(2,2,2,8000),(3,4,10,20000);
/*!40000 ALTER TABLE `sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `detail_sale`
--

/*!50001 DROP VIEW IF EXISTS `detail_sale`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `detail_sale` AS select `sale`.`sid` AS `sid`,`sale`.`eid` AS `eid`,`employee`.`name` AS `name`,`employee`.`phonenumber` AS `phonenumber`,`employee`.`totalnum` AS `totalnum`,`employee`.`totalprofit` AS `totalprofit`,`sale`.`carid` AS `carid`,`car`.`brand` AS `brand`,`car`.`model` AS `model`,`car`.`price` AS `price`,`car`.`picture` AS `picture`,`car`.`quantity` AS `quantity`,`sale`.`profit` AS `profit` from ((`sale` join `employee`) join `car`) where ((`sale`.`eid` = `employee`.`eid`) and (`sale`.`carid` = `car`.`carid`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `purchase_detail`
--

/*!50001 DROP VIEW IF EXISTS `purchase_detail`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `purchase_detail` AS select `purchase`.`pid` AS `pid`,`client`.`clientid` AS `clientid`,`client`.`name` AS `cname`,`detail_sale`.`sid` AS `sid`,`detail_sale`.`eid` AS `eid`,`detail_sale`.`name` AS `ename`,`detail_sale`.`carid` AS `carid`,`detail_sale`.`brand` AS `brand`,`detail_sale`.`model` AS `model`,`detail_sale`.`price` AS `price`,`detail_sale`.`profit` AS `profit`,`purchase`.`purchasedate` AS `purchasedate` from ((`purchase` join `detail_sale`) join `client`) where ((`purchase`.`sid` = `detail_sale`.`sid`) and (`purchase`.`clientid` = `client`.`clientid`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-29 12:04:07
