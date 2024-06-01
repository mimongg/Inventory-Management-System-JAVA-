CREATE DATABASE  IF NOT EXISTS `inventory_items` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `inventory_items`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: inventory_items
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `brand` varchar(255) NOT NULL,
  `supplier` varchar(255) NOT NULL,
  `unit_cost` decimal(10,2) NOT NULL,
  `quantity` int NOT NULL,
  `selling_price` decimal(10,2) NOT NULL,
  `location` varchar(255) NOT NULL,
  `lastmodified` datetime DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (80,'Vacuum Cleaner','Electronics','Sony','BestSupplier',100.50,20,150.75,'Aisle 3','2024-05-21 22:02:28'),(81,'Dining Table','Furniture','Ikea','HomeSupplier',200.00,10,300.00,'Aisle 5','2024-05-21 22:02:28'),(82,'Baggy Pants','Clothing','Nike','FashionSupplier',50.00,100,75.00,'Aisle 2','2024-05-21 22:02:28'),(83,'Whole Chicken','Groceries','Whole Foods','FoodSupplier',5.00,200,7.50,'Aisle 1','2024-05-21 22:02:28'),(84,'Whole Town','Toys','Lego','ToySupplier',25.00,50,40.00,'Aisle 4','2024-05-21 22:02:28'),(85,'Smart TV','Electronics','LG','ElectroSupplier',300.00,13,450.00,'Aisle 3','2024-05-23 05:21:40'),(87,'Running Shoes','Clothing','Adidas','SportySupplier',60.00,80,90.00,'Aisle 2','2024-05-21 22:02:28'),(88,'Organic Milk','Groceries','Trader Joe\'s','GrocerySupplier',3.00,300,4.50,'Aisle 1','2024-05-21 22:02:28'),(89,'Action Figure','Toys','Hasbro','ToySupplier',20.00,60,35.00,'Aisle 4','2024-05-21 22:02:28'),(90,'iPhone','Electronics','Apple','TechSupplier',1000.00,10,1200.00,'Aisle 3','2024-05-21 22:02:28'),(91,'Bookshelf','Furniture','Wayfair','FurnitureSupplier',80.00,12,150.00,'Aisle 5','2024-05-21 22:02:28'),(92,'T-shirt','Clothing','Puma','FashionSupplier',40.00,90,60.00,'Aisle 2','2024-05-21 22:02:28'),(94,'Barbie Doll','Toys','Mattel','ToySupplier',15.00,70,25.00,'Aisle 4','2024-05-21 22:02:28'),(95,'Washing Machine','Electronics','LG','ElectroSupplier',400.00,8,550.00,'Aisle 3','2024-05-21 22:02:28'),(96,'Armchair','Furniture','West Elm','HomeSupplier',4.00,13,350.00,'Aisle 5','2024-05-22 09:49:46'),(97,'Track Jacket','Clothing','Under Armour','SportySupplier',30.00,120,50.00,'Aisle 2','2024-05-21 22:02:28'),(99,'Toy Car','Toys','Fisher-Price','ToySupplier',10.00,80,20.00,'Aisle 4','2024-05-21 22:02:28'),(100,'Microwave Oven','Electronics','Panasonic','BestSupplier',150.00,18,220.00,'Aisle 3','2024-05-21 22:02:28'),(101,'Coffee Table','Furniture','CB2','HomeGoods',100.00,9,180.00,'Aisle 5','2024-05-21 22:02:28'),(102,'Sweatshirt','Clothing','Reebok','FashionSupplier',35.00,110,55.00,'Aisle 2','2024-05-21 22:02:28'),(104,'Nerf Gun','Toys','Nerf','ToySupplier',12.00,90,22.00,'Aisle 4','2024-05-21 22:02:28'),(105,'Headphones','Electronics','Bose','AudioSupplier',200.00,14,300.00,'Aisle 3','2024-05-21 22:02:28'),(106,'Luxury Sofa','Furniture','Restoration Hardware','LuxurySupplier',500.00,3,700.00,'Aisle 5','2024-05-21 22:02:28'),(108,'Bulk Chicken Breast','Groceries','Costco','WholesaleSupplier',10.00,150,15.00,'Aisle 1','2024-05-21 22:02:28'),(109,'Wooden Puzzle','Toys','Melissa & Doug','ToySupplier',18.00,40,30.00,'Aisle 4','2024-05-21 22:02:28'),(111,'Manok','Hayop','magnolia','Manukan',100.00,200,150.00,'Aisle 1','2024-05-23 11:43:54');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-23 14:13:28
