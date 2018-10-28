
-- 1. Ceate users table
-- Store user information

CREATE TABLE users (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `birth` date NOT NULL,
  `address` varchar(500) DEFAULT NULL,
  `contact_number` varchar(15) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25;




-- truncate table users;

------------------------------------------------------------------------------------------------------------------------------------------------
-- INSERT..
------------------------------------------------------------------------------------------------------------------------------------------------

-- insert user dummy data 
INSERT INTO `users` (`id`,`user_id`,`first_name`,`last_name`,`birth`,`address`,`contact_number`,`email`,`password`) VALUES (1,'antony1007','antony','Greg','1981-10-07','11522 Railway Ibis, Riverview FL 33569','+1408-775-6987','test@test.com','password123');
INSERT INTO `users` (`id`,`user_id`,`first_name`,`last_name`,`birth`,`address`,`contact_number`,`email`,`password`) VALUES (2,'Chris0317','Chris','Greg','2014-10-07','11522 Railway Ibis, Riverview FL 33569','+1813-775-6987','test2@test.com','password1454');
INSERT INTO `users` (`id`,`user_id`,`first_name`,`last_name`,`birth`,`address`,`contact_number`,`email`,`password`) VALUES (3,'Eliz0420','Eliz','Greg','2017-01-10','11522 Railway Plaza, Aurora IL 33569','+1302-775-6987','test3@test.com','password2');
INSERT INTO `users` (`id`,`user_id`,`first_name`,`last_name`,`birth`,`address`,`contact_number`,`email`,`password`) VALUES (4,'Roger0915','Roger','Federer','1980-09-15','Tennis plaza, Tennis City, Swiss 0523','+7523-775-6987','roger@roger.com','password223');
INSERT INTO `users` (`id`,`user_id`,`first_name`,`last_name`,`birth`,`address`,`contact_number`,`email`,`password`) VALUES (5,'Nadal0820','Rafael','Nadal','1981-08-20','Tennis plaza, Tennis City, Swiss 0523','+7523-775-6987','nadal@roger.com','password263');
INSERT INTO `users` (`id`,`user_id`,`first_name`,`last_name`,`birth`,`address`,`contact_number`,`email`,`password`) VALUES (6,'Djoko1010','Novak','Djokovic','1982-10-10','Tennis plaza, Tennis City, Swiss 0523','+7523-775-6987','djoko@roger.com','password243');
INSERT INTO `users` (`id`,`user_id`,`first_name`,`last_name`,`birth`,`address`,`contact_number`,`email`,`password`) VALUES (7,'Wawrinka0208','Stan','Wawrinka','1981-02-08','Tennis plaza, Tennis City, Swiss 0523','+7523-775-6987','stan@roger.com','password293');
INSERT INTO `users` (`id`,`user_id`,`first_name`,`last_name`,`birth`,`address`,`contact_number`,`email`,`password`) VALUES (11,'test0101','Tester first name','Tester Last name','1981-10-25','tester street, tester city, tester state, 10001','+1 222-333-4444','tester123@testers.com','123-433p2d-');




------------------------------------------------------------------------------------------------------------------------------------------------
-- INSERT..
------------------------------------------------------------------------------------------------------------------------------------------------
 -- drop table users;



-- 2. available policies

 -- drop table policies;

CREATE TABLE policies (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  policy_name varchar(100) NOT NULL,
  detailed_name varchar(100) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=25;

INSERT INTO `policies` (`id`,`policy_name`,`detailed_name`) VALUES (1,'Be Strong','Health Insurance Policy');
INSERT INTO `policies` (`id`,`policy_name`,`detailed_name`) VALUES (2,'Clear White','Dental Insurance Policy');
INSERT INTO `policies` (`id`,`policy_name`,`detailed_name`) VALUES (3,'EyeMed','Clear vision from clear eyes');
INSERT INTO `policies` (`id`,`policy_name`,`detailed_name`) VALUES (4,'WithYouOnRoad','Policy for auto vehicles');
INSERT INTO `policies` (`id`,`policy_name`,`detailed_name`) VALUES (5,'RideSafe','Insurance Policy for 2 wheelers');
INSERT INTO `policies` (`id`,`policy_name`,`detailed_name`) VALUES (6,'NotJustLand','Policy For Boats and Ships');

 -- drop table user_policies;
 
 -- 3. Policies users bought

CREATE TABLE user_policies(
		id bigint(20) NOT NULL auto_increment,
		policy_id bigint(20) NOT NULL,
		user_id bigint(20) not null,
		amount_paid double(16,2) NOT NULL,
		policy_end_date date not null,
	PRIMARY KEY (id),
    foreign key(user_id) references users(id) on delete cascade on update cascade,
    foreign key(policy_id) references policies(id) on delete cascade on update cascade
)ENGINE=InnoDB AUTO_INCREMENT=25;



INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (1,1,4,3090.00,'2020-10-15');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (2,3,4,3908.00,'2020-10-16');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (3,6,1,2014.00,'2020-10-17');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (4,6,2,2508.00,'2010-10-18');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (5,5,1,2838.00,'2020-10-19');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (6,1,4,2427.00,'2020-10-20');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (7,6,2,3955.00,'2015-10-21');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (8,2,3,3179.00,'2020-10-22');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (9,3,3,3652.00,'2020-10-23');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (10,2,4,2929.00,'2008-10-24');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (11,5,3,2845.00,'2020-10-25');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (12,3,5,4067.00,'2020-10-26');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (13,5,1,3888.00,'2020-10-27');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (14,3,1,3178.00,'2020-10-28');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (15,6,3,3561.00,'2002-10-29');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (16,2,1,3056.00,'2020-10-30');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (17,5,3,3069.00,'2020-10-31');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (18,2,3,2524.00,'2020-10-15');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (19,5,1,2458.00,'2020-10-05');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (20,4,1,2896.00,'2020-10-25');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (21,3,5,3266.00,'2020-06-30');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (22,4,2,3480.00,'2020-02-28');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (23,4,6,4580.00,'2015-02-28');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (24,4,7,14580.00,'2015-02-28');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (25,3,7,40.00,'2015-02-28');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (27,3,6,5600.82,'2016-12-20');
INSERT INTO `user_policies` (`id`,`policy_id`,`user_id`,`amount_paid`,`policy_end_date`) VALUES (28,3,6,5600.82,'2016-12-20');




-- Checking the data
select * 
from user_policies up, users u
WHERE 1=1
AND up.user_id = u.id
and up.user_id =7;


select * 
from user_policies up, users u, policies p
WHERE 1=1
AND up.user_id = u.id
AND up.policy_id = p.id
and up.user_id =6;

-- This is the query will be used in UI

select up.id, p.policy_name, up.amount_paid, up.policy_end_date, u.first_name
from user_policies up, users u, policies p
WHERE 1=1
AND up.user_id = u.id
AND up.policy_id = p.id
and up.user_id =6;

SELECT * FROM users
WHERE 1=1;

select * from policies
WHERE 1=1;


SELECT * FROM user_policies;



