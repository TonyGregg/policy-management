
-- Ceate users table
-- Store user information

CREATE TABLE `users` (
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



------------------------------------------------------------------------------------------------------------------------------------------------
-- INSERT..
------------------------------------------------------------------------------------------------------------------------------------------------

-- insert user dummy data 


insert into users values(1,'antony1007','antony','Greg','1981-10-07','11522 Railway Ibis, Riverview FL 33569', '+1408-775-6987','test@test.com','password123');
insert into users values(2,'Chris0317','Chris','Greg','2014-10-07','11522 Railway Ibis, Riverview FL 33569', '+1813-775-6987','test2@test.com','password1454');
insert into users values(3,'Eliz0420','Eliz','Greg','2017-01-10','11522 Railway Plaza, Aurora IL 33569', '+1302-775-6987','test3@test.com','password2');
insert into users values(4,'Roger0915','Roger','Federer','1980-09-15','Tennis plaza, Tennis City, Swiss 0523', '+7523-775-6987','roger@roger.com','password223');

select * 
from users
WHERE 1=1;


------------------------------------------------------------------------------------------------------------------------------------------------
-- INSERT..
------------------------------------------------------------------------------------------------------------------------------------------------

-- insert user dummy data 


insert into users values(1,'antony1007','antony','Greg','1981-10-07','11522 Railway Ibis, Riverview FL 33569', '+1408-775-6987','test@test.com','password123');
insert into users values(2,'Chris0317','Chris','Greg','2014-10-07','11522 Railway Ibis, Riverview FL 33569', '+1813-775-6987','test2@test.com','password1454');
insert into users values(3,'Eliz0420','Eliz','Greg','2017-01-10','11522 Railway Plaza, Aurora IL 33569', '+1302-775-6987','test3@test.com','password2');
insert into users values(4,'Roger0915','Roger','Federer','1980-09-15','Tennis plaza, Tennis City, Swiss 0523', '+7523-775-6987','roger@roger.com','password223');


-- 2. available_policies

CREATE TABLE policies (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  policy_name varchar(100) NOT NULL,
  detailed_name varchar(100) NOT NULL,  
  user_id bigint(20) NOT NULL,
  amount_paid double(16,2) NOT NULL,
  policy_end_date date not null,
  PRIMARY KEY (id),
  foreign key(user_id) references users(id) on delete cascade
) ENGINE=InnoDB AUTO_INCREMENT=25;

INSERT INTO policies values(1,'AntonyHealthPolicy','Antonys Health Policy',1,15000,'2020-10-15');
INSERT INTO policies values(2,'AntonyAutoPolicy','Antonys Auto Policy',1,600,'2020-10-16');
INSERT INTO policies values(3,'AntonyBoatPolicy','Antonys Boat Policy',1,750,'2020-10-17');
INSERT INTO policies values(4,'AntonsHomePolicy','Antonys Home Policy',1,1300,'2010-10-18');
INSERT INTO policies values(5,'ChrisAutoPolicy','Chriss Auto Policy',2,600,'2020-10-19');
INSERT INTO policies values(6,'ChrisHomePolicy','Chriss Home Policy',2,650,'2020-10-20');
INSERT INTO policies values(7,'ChrisAutoPolicy','Chriss BOat Policy',2,7852,'2015-10-21');
INSERT INTO policies values(8,'ChrisHealthPolicy','Chriss Health Policy',2,6578,'2020-10-22');
INSERT INTO policies values(9,'ElizAutoPolicy','Elizs Auto Policy',3,650,'2020-10-23');
INSERT INTO policies values(10,'ElizHomePolicy','Elizs Home Policy',3,650,'2008-10-24');
INSERT INTO policies values(11,'ElizAutoPolicy','Elizs BOat Policy',3,600,'2020-10-25');
INSERT INTO policies values(12,'ElizHealthPolicy','Elizs Health Policy',3,789,'2020-10-26');
INSERT INTO policies values(13,'RogerAutoPolicy','Rogers Auto Policy',4,650,'2020-10-27');
INSERT INTO policies values(14,'RogerHomePolicy','Rogers Home Policy',4,150,'2020-10-28');
INSERT INTO policies values(15,'RogerAutoPolicy','Rogers BOat Policy',4,60,'2002-10-29');
INSERT INTO policies values(16,'RogerHealthPolicy','Rogers Health Policy',4,789,'2020-10-30');
INSERT INTO policies values(17,'RogerTennisPOlicy','Rogers Tennis Policy',4,89000,'2020-10-31');
INSERT INTO policies values(18,'RogerHandPolicy','Hand insurance policy',4,5600,'2020-10-05');





select * 
from users
WHERE 1=1;



