INSERT IGNORE INTO compareIt.`user`
(id, createdat, email, first_name, last_name, password, updatedat, company_id)
VALUES(1, '2019-10-21 13:26:37.438', 'test@test.fr', 'test', 'test', '$2a$10$dRfKgYSqqyb4zVm5aaqhF.tHIWzQyZORBAq/KnSgdGrB0YI/ZWpga', NULL, NULL);

INSERT IGNORE INTO compareIt.roles (user_id, roles) VALUES(1, 'ROLE_CUSTOMER');



INSERT IGNORE INTO `model` VALUES (1,_binary '','2019-11-27 10:42:33.256000','Vehicules','cars','2019-11-27 10:42:33.256000'),(2,_binary '','2019-11-27 10:42:33.367000','Telephones','phones','2019-11-27 10:42:33.367000');
INSERT IGNORE INTO `model_property` VALUES (1,_binary '','2019-11-27 10:42:32.898000',_binary '',_binary '',_binary '',NULL,NULL,'Fabricant','maker',1,'2019-11-27 10:42:32.900000'),(2,_binary '','2019-11-27 10:42:33.150000',_binary '',_binary '',_binary '',NULL,NULL,'Modèle','model',1,'2019-11-27 10:42:33.150000'),(3,_binary '','2019-11-27 10:42:33.176000',_binary '',_binary '',_binary '',NULL,NULL,'Taille','size',1,'2019-11-27 10:42:33.176000'),(4,_binary '','2019-11-27 10:42:33.195000',_binary '\0',_binary '',_binary '',NULL,NULL,'Format','format',1,'2019-11-27 10:42:33.195000'),(5,_binary '','2019-11-27 10:42:33.220000',_binary '\0',_binary '',_binary '',5,2,'Nombre de portes','doors',0,'2019-11-27 10:42:33.220000'),(6,_binary '','2019-11-27 10:42:33.238000',_binary '\0',_binary '',_binary '',5,4,'Nombre de Places','seats',0,'2019-11-27 10:42:33.238000'),(7,_binary '','2019-11-27 10:42:33.324000',_binary '',_binary '',_binary '',NULL,NULL,'Marque','brand',1,'2019-11-27 10:42:33.324000'),(8,_binary '','2019-11-27 10:42:33.349000',_binary '',_binary '',_binary '',NULL,NULL,'Modele','model',1,'2019-11-27 10:42:33.349000');
INSERT IGNORE INTO `model_model_properties` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(2,7),(2,8);
INSERT IGNORE INTO `website_configuration` VALUES (1,'#c26d6d','#50459c','#82bd2a','2019-11-27 10:42:33.401000',_binary '','picture','2019-11-27 10:42:33.401000');
INSERT IGNORE INTO `website_configuration_models` VALUES (1,1),(1,2);

