CREATE DATABASE  IF NOT EXISTS `clinicadental` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `clinicadental`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: clinicadental
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `productoxsucursal`
--

DROP TABLE IF EXISTS `productoxsucursal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productoxsucursal` (
  `CodProdSu` int NOT NULL AUTO_INCREMENT,
  `CodProducto` int DEFAULT NULL,
  `CodSucursal` int DEFAULT NULL,
  `Cantidad` int DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`CodProdSu`),
  KEY `CodProducto_idx` (`CodProducto`),
  KEY `CodSucursal_idx` (`CodSucursal`),
  CONSTRAINT `CodProducto` FOREIGN KEY (`CodProducto`) REFERENCES `productos` (`CodProducto`),
  CONSTRAINT `fk_prodxsu_codsuc` FOREIGN KEY (`CodSucursal`) REFERENCES `sucursales` (`CodSucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productoxsucursal`
--

LOCK TABLES `productoxsucursal` WRITE;
/*!40000 ALTER TABLE `productoxsucursal` DISABLE KEYS */;
INSERT INTO `productoxsucursal` VALUES (1,1,1,1,'A'),(2,1,2,1,'A'),(3,2,1,1,'A'),(4,2,2,1,'D');
/*!40000 ALTER TABLE `productoxsucursal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-21 20:38:42
