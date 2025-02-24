CREATE DATABASE  IF NOT EXISTS `dbtechnicaltestinnovizecem` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dbtechnicaltestinnovizecem`;
-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dbtechnicaltestinnovizecem
-- ------------------------------------------------------
-- Server version	9.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos` (
  `duration_weeks` int NOT NULL,
  `price` double NOT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `start_date` datetime(6) NOT NULL,
  `teacher_id` bigint NOT NULL,
  `name_course` varchar(150) NOT NULL,
  `description` varchar(500) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKner2votgq63nf8a1ntl638xw2` (`teacher_id`),
  CONSTRAINT `FKner2votgq63nf8a1ntl638xw2` FOREIGN KEY (`teacher_id`) REFERENCES `teachers` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` VALUES (12,150,1,'2022-12-31 19:00:00.000000',1,'Math','Advanced Math Course'),(16,47796.26,2,'2026-03-01 19:00:00.000000',1,'Healthcare Administration 2828','and visual storytelling.'),(29,21358.53,3,'2026-10-10 19:00:00.000000',2,'Criminal Justice 2727','Study of government institutions and political processes.'),(10,41448.17,4,'2026-12-08 19:00:00.000000',3,'Photography 3535','composition'),(27,48955.95,5,'2026-11-12 19:00:00.000000',4,'Drama 2525','and visual storytelling.'),(23,48003.34,6,'2025-05-04 19:00:00.000000',5,'Sociology 1111','Study of animal health and medical care practices.'),(18,15076.45,7,'2025-05-21 19:00:00.000000',6,'Hospitality Management 3838','Analysis of literary works and authors in English literature.'),(22,10035.57,8,'2026-10-18 19:00:00.000000',7,'Sociology 1113','advocacy'),(29,44079.2,9,'2026-08-04 19:00:00.000000',8,'Biology 303','Investigation of the Earth\'s structure and processes.'),(9,30514.42,10,'2026-01-18 19:00:00.000000',9,'Sociology 2104','and interpretation.'),(13,34196.8,11,'2025-08-11 19:00:00.000000',10,'Sports Management 4040','and medical procedures.'),(9,16945.5,12,'2026-09-21 19:00:00.000000',11,'Forensic Science 4141','Examination of society and human behavior.'),(9,42468.41,13,'2025-05-31 19:00:00.000000',12,'English Literature 404','Analysis of economic systems and principles.'),(24,48845.07,14,'2026-06-13 19:00:00.000000',13,'Administration 2728','Study of journalistic practices and media communication.'),(13,48383.86,15,'2026-02-14 19:00:00.000000',14,'Social Work 4747','Exploration of physical therapy techniques and rehabilitation practices.'),(18,40236.63,16,'2026-10-01 19:00:00.000000',15,'Economics 1212','Study of government institutions and political processes.'),(28,28339.17,17,'2026-01-12 19:00:00.000000',16,'Management 4140','and medical procedures.'),(10,32239.78,18,'2026-08-27 19:00:00.000000',17,'Dental Hygiene 4343','Exploration of dental hygiene practices and oral health.'),(16,44203.3,19,'2026-04-02 19:00:00.000000',18,'Computer Science 505','Examination of environmental issues and conservation efforts.'),(11,28665.72,20,'2025-03-06 19:00:00.000000',19,'Dance 3434','Exploration of various art forms and their significance.'),(15,47572.72,21,'2026-03-11 19:00:00.000000',20,'Economics 122','Exploration of fundamental questions about existence and knowledge.'),(28,47378.48,22,'2025-08-07 19:00:00.000000',21,'Photography 3534','and ethical considerations.');
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teachers` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `document` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `name` varchar(150) NOT NULL,
  `rol_user` enum('ADMIN','STUDENT','TEACHER') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
INSERT INTO `teachers` VALUES (1,'123456789','john.dosee@example.com','John Doee','TEACHER'),(2,'8193186311','myongee0@multiply.com','Marve Yongee','STUDENT'),(3,'1410839265','hharboord1@reference.com','Hollden Harboord','ADMIN'),(4,'0981246540','mbarrows2@tumblr.com','Margery Barrows','ADMIN'),(5,'1028437811','eharston3@clickbank.net','Emiline Harston','ADMIN'),(6,'2411195613','hjosefovic4@chron.com','Henriette Josefovic','TEACHER'),(7,'9712816419','tmacgiolla5@mtv.com','Tamas MacGiolla Pheadair','ADMIN'),(8,'9520566880','pmachan6@livejournal.com','Phyllida Machan','ADMIN'),(9,'2773738152','rannesley7@dion.ne.jp','Rozele Annesley','TEACHER'),(10,'2028745495','bprujean8@hostgator.com','Ber Prujean','TEACHER'),(11,'5846433510','brubinowitsch9@accuweather.com','Barbi Rubinowitsch','TEACHER'),(12,'7920963087','growledgea@cnn.com','Gorden Rowledge','STUDENT'),(13,'5820947134','pgravesb@ucoz.com','Padriac Graves','ADMIN'),(14,'9547371851','bkarpmannc@theglobeandmail.com','Baxter Karpmann','TEACHER'),(15,'3144201154','gtaxd@photobucket.com','Ginni Tax','STUDENT'),(16,'3921011248','dgeraldeze@bing.com','Delcina Geraldez','ADMIN'),(17,'2579186026','mbucknerf@ibm.com','Mireielle Buckner','STUDENT'),(18,'9219635569','bbridgettg@stanford.edu','Briggs Bridgett','STUDENT'),(19,'6537464161','rlamburneh@hexun.com','Riki Lamburne','STUDENT'),(20,'5936005232','tyurivtsevi@cloudflare.com','Ted Yurivtsev','ADMIN'),(21,'6318233571','cgillj@narod.ru','Cirstoforo Gill','TEACHER'),(22,'2778601112','sdubberk@biglobe.ne.jp','Sybila Dubber','ADMIN'),(23,'3675162338','lpannamanl@phoca.cz','Lizbeth Pannaman','TEACHER'),(24,'4384623585','pbaudicn@google.com.au','Pauly Baudic','STUDENT'),(25,'4621813692','srichardssono@umn.edu','Stan Richardsson','ADMIN'),(26,'8966948189','correttp@ovh.net','Charmian Orrett','STUDENT'),(27,'6832499531','hmcbayneq@a8.net','Homer McBayne','ADMIN'),(28,'7781133595','wgatheridger@dot.gov','Willow Gatheridge','STUDENT'),(29,'1933983337','wklossers@parallels.com','Willie Klosser','STUDENT'),(30,'0260995339','btebbettt@cam.ac.uk','Bjorn Tebbett','ADMIN'),(31,'2673033556','ugogieu@ow.ly','Ursola Gogie','STUDENT'),(32,'4636287797','jtrusslovev@dot.gov','Jany Trusslove','STUDENT'),(33,'6850837257','borreyw@feedburner.com','Babita Orrey','ADMIN'),(34,'8191677393','rmacgarveyx@mapy.cz','Rex MacGarvey','TEACHER'),(35,'1044934964','aholsally@china.com.cn','Ailbert Holsall','TEACHER'),(36,'8080173605','pjigginsz@usatoday.com','Pyotr Jiggins','STUDENT'),(37,'6721142074','sriguard10@ucsd.edu','Sheffie Riguard','TEACHER'),(38,'2632144841','titzkovsky11@phoca.cz','Torrie Itzkovsky','ADMIN'),(39,'6302000270','rdressell12@berkeley.edu','Royal Dressell','ADMIN'),(40,'2733764977','alucock13@marketwatch.com','Ailene Lucock','TEACHER'),(41,'3582369390','sglasman14@pen.io','Saidee Glasman','STUDENT'),(42,'6324645096','tfoston15@bloomberg.com','Tove Foston','STUDENT'),(43,'6948154751','bfanthome16@51.la','Bobine Fanthome','ADMIN'),(44,'7432049696','bsemour17@disqus.com','Becka Semour','STUDENT'),(45,'8157742692','cstrippel18@mapy.cz','Conant Strippel','STUDENT'),(46,'2371842303','tdulson19@narod.ru','Timothea Dulson','TEACHER'),(47,'5071576325','dovanesian1a@a8.net','Donielle Ovanesian','ADMIN'),(48,'2043459279','bjamme1b@berkeley.edu','Breanne Jamme','TEACHER'),(49,'7134601870','fsharple1c@thetimes.co.uk','Ferdinand Sharple','ADMIN'),(50,'2041063637','jamery1d@blogtalkradio.com','Jacinthe Amery','STUDENT');
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-24 17:06:09
