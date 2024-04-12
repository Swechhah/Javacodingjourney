-- MariaDB dump 10.19  Distrib 10.4.32-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: portfolio_management_system
-- ------------------------------------------------------
-- Server version	10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aboutinfo`
--

DROP TABLE IF EXISTS `aboutinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aboutinfo` (
  `InfoID` int(11) NOT NULL,
  `FullName` varchar(255) DEFAULT NULL,
  `Title` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`InfoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aboutinfo`
--

LOCK TABLES `aboutinfo` WRITE;
/*!40000 ALTER TABLE `aboutinfo` DISABLE KEYS */;
INSERT INTO `aboutinfo` VALUES (1,'Sita Thapa','Software Engineer','Experienced software engineer with expertise in web development.'),(2,'Ram Sharma','Graphic Designer','Creative designer specializing in small business and personal branding.'),(3,'Hari Shrestha','Web Developer','Experienced web developer capable of designing and developing websites.'),(4,'Gita Rai','Marketing Manager','Outstanding marketing research and marketing plan and program development.'),(5,'Krishna Khatri','Project Manager','Organizational planning and project development and management.');
/*!40000 ALTER TABLE `aboutinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactinfo`
--

DROP TABLE IF EXISTS `contactinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contactinfo` (
  `ContactID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ContactID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactinfo`
--

LOCK TABLES `contactinfo` WRITE;
/*!40000 ALTER TABLE `contactinfo` DISABLE KEYS */;
INSERT INTO `contactinfo` VALUES (6,'Nabin Adhikari','nabin123@gmail.com','9841234567'),(7,'Anita Lama','lama.anita@hotmail.com','9812345678'),(8,'Suresh Thapa','suresht@yahoo.com','9823456789'),(9,'Bimala Gurung','bimala1995@hotmail.com','9834567890'),(10,'Rajesh Bhandari','rajeshbhan@gmail.com','9845678901');
/*!40000 ALTER TABLE `contactinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projects`
--

DROP TABLE IF EXISTS `projects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `projects` (
  `ProjectID` int(11) NOT NULL AUTO_INCREMENT,
  `ProjectName` varchar(100) DEFAULT NULL,
  `Description` text DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `CompletionDate` date DEFAULT NULL,
  PRIMARY KEY (`ProjectID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projects`
--

LOCK TABLES `projects` WRITE;
/*!40000 ALTER TABLE `projects` DISABLE KEYS */;
INSERT INTO `projects` VALUES (1,'E-commerce Website','Built an e-commerce website for a client.','2023-01-01','2023-03-15'),(2,'Corporate Branding','Designed branding materials for a corporate client.','2023-04-01','2023-05-15'),(3,'Mobile App Development','Developed a mobile app for a startup company.','2023-06-01','2023-08-15'),(4,'SEO Campaign','Conducted an SEO campaign to improve website rankings.','2023-09-01','2023-10-15'),(5,'Content Writing Project','Produced high-quality content for a content marketing campaign.','2023-11-01','2023-12-15');
/*!40000 ALTER TABLE `projects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `services`
--

DROP TABLE IF EXISTS `services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `services` (
  `ServiceID` int(11) NOT NULL AUTO_INCREMENT,
  `ServiceName` varchar(100) DEFAULT NULL,
  `Description` text DEFAULT NULL,
  `InfoID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ServiceID`),
  KEY `InfoID` (`InfoID`),
  CONSTRAINT `services_ibfk_1` FOREIGN KEY (`InfoID`) REFERENCES `aboutinfo` (`InfoID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `services`
--

LOCK TABLES `services` WRITE;
/*!40000 ALTER TABLE `services` DISABLE KEYS */;
INSERT INTO `services` VALUES (1,'Web Development','Designing and developing responsive websites.',1),(2,'Graphic Design','Creating visually appealing designs for various purposes.',2),(3,'Mobile App Development','Developing custom mobile applications for Android and iOS platforms.',3),(4,'SEO Services','Improving website visibility and ranking on search engines.',4),(5,'Content Writing','Producing high-quality written content for websites and blogs.',5);
/*!40000 ALTER TABLE `services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skills`
--

DROP TABLE IF EXISTS `skills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `skills` (
  `SkillID` int(11) NOT NULL AUTO_INCREMENT,
  `SkillName` varchar(100) DEFAULT NULL,
  `Description` text DEFAULT NULL,
  `InfoID` int(11) DEFAULT NULL,
  PRIMARY KEY (`SkillID`),
  KEY `InfoID` (`InfoID`),
  CONSTRAINT `skills_ibfk_1` FOREIGN KEY (`InfoID`) REFERENCES `aboutinfo` (`InfoID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skills`
--

LOCK TABLES `skills` WRITE;
/*!40000 ALTER TABLE `skills` DISABLE KEYS */;
INSERT INTO `skills` VALUES (1,'HTML/CSS','Proficient in HTML and CSS for front-end development.',1),(2,'Adobe Photoshop','Skilled in using Adobe Photoshop for graphic designing.',2),(3,'JavaScript','Strong understanding of JavaScript programming language.',3),(4,'SEO Optimization','Expertise in optimizing websites for search engines.',4),(5,'Content Creation','Ability to create engaging and informative content.',5);
/*!40000 ALTER TABLE `skills` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-12 23:04:25
