/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.23 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `labels` (
	`label_id` int ,
	`label_system_id` int ,
	`label_name` varchar ,
	`parent_id` int ,
	`parent_labels` varchar 
); 
insert into `labels` (`label_id`, `label_system_id`, `label_name`, `parent_id`, `parent_labels`) values('1','1','sss',NULL,NULL);
