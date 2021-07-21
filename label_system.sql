/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.23 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `label_system` (
	`label_system_id` int ,
	`label_system_name` varchar ,
	`create_time` datetime ,
	`person` varchar 
); 
insert into `label_system` (`label_system_id`, `label_system_name`, `create_time`, `person`) values('1','2','2021-07-22 22:48:37','one');
insert into `label_system` (`label_system_id`, `label_system_name`, `create_time`, `person`) values('2','3','2021-07-23 22:48:55','to');
