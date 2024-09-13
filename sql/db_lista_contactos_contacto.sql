-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: db_lista_contactos
-- ------------------------------------------------------
-- Server version	9.0.0

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
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contacto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `foto` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (1,'Juan','Pérez','1980-01-15','123-456-7890',' '),(2,'Ana','Gómez','1992-02-28','123-456-7891',' '),(3,'Luis','Martínez','1985-03-12','123-456-7892',' '),(4,'María','Rodríguez','1978-04-25','123-456-7893',' '),(5,'Carlos','López','1990-05-05','123-456-7894',' '),(6,'Laura','Fernández','1982-06-18','123-456-7895',' '),(7,'Pedro','García','1975-07-22','123-456-7896',' '),(8,'Marta','Sánchez','1994-08-30','123-456-7897',' '),(9,'Jorge','Ramírez','1987-09-14','123-456-7898',' '),(10,'Sofía','Torres','1991-10-10','123-456-7899',' '),(11,'Raúl','Vázquez','1984-11-21','123-456-7900',' '),(12,'Elena','Cruz','1979-12-05','123-456-7901',' '),(13,'Alberto','Gutiérrez','1983-01-19','123-456-7902',' '),(14,'Patricia','Castro','1993-02-27','123-456-7903',' '),(15,'Manuel','Ruiz','1988-03-11','123-456-7904',' '),(16,'Isabel','Molina','1995-04-26','123-456-7905',' '),(17,'Francisco','Delgado','1977-05-15','123-456-7906',' '),(18,'Sara','Ortiz','1986-06-20','123-456-7907',' '),(19,'Pablo','Moreno','1996-07-30','123-456-7908',' '),(20,'Claudia','Gil','1981-08-17','123-456-7909',' '),(21,'David','Ramos','1976-09-23','123-456-7910',' '),(22,'Cristina','Medina','1997-10-08','123-456-7911',' '),(23,'Javier','Iglesias','1989-11-19','123-456-7912',' '),(24,'Teresa','Soto','1980-12-04','123-456-7913',' '),(25,'Enrique','Méndez','1985-01-22','123-456-7914',' '),(26,'Rosa','Romero','1992-02-29','123-456-7915',' '),(27,'Andrés','Herrera','1991-03-12','123-456-7916',' '),(28,'Eva','Flores','1978-04-25','123-456-7917',' '),(29,'Ricardo','Vargas','1984-05-09','123-456-7918',' '),(30,'Adriana','Cabrera','1990-06-18','123-456-7919',' '),(31,'Miguel','Reyes','1975-07-22','123-456-7920',' '),(32,'Natalia','Castillo','1994-08-30','123-456-7921',' '),(33,'Tomás','Espinosa','1987-09-14','123-456-7922',' '),(34,'Beatriz','Silva','1991-10-10','123-456-7923',' '),(35,'Rubén','Guerrero','1982-11-21','123-456-7924',' '),(36,'Lucía','Rojas','1979-12-05','123-456-7925',' '),(37,'Hugo','Paredes','1983-01-19','123-456-7926',' '),(38,'Verónica','Campos','1993-02-27','123-456-7927',' '),(39,'Álvaro','Santiago','1988-03-11','123-456-7928',' '),(40,'Daniela','Mendoza','1995-04-26','123-456-7929',' '),(41,'Gonzalo','Peña','1977-05-15','123-456-7930',' '),(42,'Valeria','Navarro','1986-06-20','123-456-7931',' '),(43,'Víctor','Cortés','1996-07-30','123-456-7932',' '),(44,'Paula','Acosta','1981-08-17','123-456-7933',' '),(45,'Antonio','Salinas','1976-09-23','123-456-7934',' '),(46,'Raquel','Cordero','1997-10-08','123-456-7935',' '),(47,'Óscar','Arenas','1989-11-19','123-456-7936','  '),(48,'Carolina','Fuentes','1980-12-04','123-456-7937',' '),(49,'Felipe','Mora','1985-01-22','123-456-7938',' '),(50,'Alicia','Rivera','1992-02-29','123-456-7939',' '),(51,'Alex','Cordon Vila','1992-12-31','666666666',' '),(52,'John','Doe','1966-12-01','666115599',' '),(53,'','Doe','1966-12-01','666115599',' '),(54,'qwerty','Doe','1966-12-01','666115599',' '),(55,'Juan','Lopez','1910-10-10','444444444',' '),(56,'zzzz','xxxxx','1111-11-11','111111111',' '),(57,'asdsadsad','dasdsadas','1992-12-31','111223344',' '),(58,'asdsad','asdfsdf','1992-12-31','111111111','5160911.JPG'),(59,'asdadasd','sadsadsad','1111-12-31','333333333','imagenesTalochocolate.jpg'),(60,'asfsdf','adsfasdf','1223-12-31','111111111','carbon.png'),(61,'asdsad','asdsad','1111-12-31','111111111','imagenesTalochocolate.jpg'),(62,'qretteretrter','ertterertretret','1111-12-31','111111111','carbon.png'),(63,'asdasdsa','dadsad','1992-12-31','313111133','imagenesTalochocolate.jpg'),(64,'Carles','Puigdemon','1442-11-01','616214622','imagenesTalochocolate.jpg'),(65,'Jani','Liante','1010-10-10','12312312','imagenesTalochocolate.jpg'),(66,'asdads','asdasd','2024-09-04','','imagenesTalochocolate.jpg'),(67,'Juan','perro','1992-12-31','666221122','imagenesTalochocolate.jpg'),(68,'Alex','qqqqq','1992-12-31','666666666','carbon.png');
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-13  9:59:57
