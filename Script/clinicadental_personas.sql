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
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `CodPersona` int NOT NULL AUTO_INCREMENT,
  `CodUsuarios` int NOT NULL,
  `CodCargos` int NOT NULL,
  `CodSucursal` int NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `FechaNac` date NOT NULL,
  `FechaRegistro` date NOT NULL,
  `DUI` int NOT NULL,
  `Telefono` int NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  `Estado` char(1) NOT NULL,
  PRIMARY KEY (`CodPersona`),
  UNIQUE KEY `DUI_UNIQUE` (`DUI`),
  UNIQUE KEY `Telefono_UNIQUE` (`Telefono`),
  KEY `CodUsuarios_idx` (`CodUsuarios`),
  KEY `CodCargos_idx` (`CodCargos`),
  KEY `CodSucursal_idx` (`CodSucursal`),
  CONSTRAINT `CodCargos` FOREIGN KEY (`CodCargos`) REFERENCES `cargos` (`CodCargos`),
  CONSTRAINT `CodSucursal` FOREIGN KEY (`CodSucursal`) REFERENCES `sucursales` (`CodSucursal`),
  CONSTRAINT `CodUsuarios` FOREIGN KEY (`CodUsuarios`) REFERENCES `usuarios` (`CodUsuarios`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,1,1,1,'Mauricio','Castillo','2000-01-02','2022-08-10',1231228,2134789,'San Salvador','A'),(2,2,2,2,'Javier','Bolaños','2000-01-02','2022-08-10',1231558,2134586,'San Salvador','A'),(3,3,3,3,'Carla','Artiga','2000-01-02','2022-08-10',1236258,2124681,'San Salvador','A'),(4,4,4,4,'Gabriel','Lopez','2000-01-02','2022-08-10',1233258,2134585,'San Salvador','A');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-14 15:16:19
