DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `lname` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

LOCK TABLES `users` WRITE;
INSERT INTO `users` VALUES (3,'Ram','Bahadur','ram@gmail.com','Hello12'),(4,'Bibek','Bhattarai','bibek@gmail.com','Password'),(5,'Hari','Bahadur','hari@gmail.com','111'),(10,'Bishwash','Sharma','bis@gmail.com','Bis12'),(12,'Shyam','Bahadur','shyam@gmail.com','Pass11');
UNLOCK TABLES;