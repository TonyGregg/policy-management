
-- Ceate users table
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



------------------------------------------------------------------------------------------------------------------------------------------------
-- INSERT..
------------------------------------------------------------------------------------------------------------------------------------------------

-- insert user dummy data 


truncate table users;

insert into users values(1,'antony1007','antony','Greg','1981-10-07','11522 Railway Ibis, Riverview FL 33569', '+1408-775-6987','test@test.com','password123');
insert into users values(2,'Chris0317','Chris','Greg','2014-10-07','11522 Railway Ibis, Riverview FL 33569', '+1813-775-6987','test2@test.com','password1454');
insert into users values(3,'Eliz0420','Eliz','Greg','2017-01-10','11522 Railway Plaza, Aurora IL 33569', '+1302-775-6987','test3@test.com','password2');
insert into users values(4,'Roger0915','Roger','Federer','1980-09-15','Tennis plaza, Tennis City, Swiss 0523', '+7523-775-6987','roger@roger.com','password223');
insert into users values(5,'Nadal0820','Rafael','Nadal','1981-08-20','Tennis plaza, Tennis City, Swiss 0523', '+7523-775-6987','nadal@roger.com','password263');
insert into users values(6,'Djoko1010','Novak','Djokovic','1982-10-10','Tennis plaza, Tennis City, Swiss 0523', '+7523-775-6987','djoko@roger.com','password243');
insert into users values(7,'Wawrinka0208','Stan','Wawrinka','1981-02-08','Tennis plaza, Tennis City, Swiss 0523', '+7523-775-6987','stan@roger.com','password293');

select * 
from users
WHERE 1=1;




------------------------------------------------------------------------------------------------------------------------------------------------
-- INSERT..
------------------------------------------------------------------------------------------------------------------------------------------------
drop table users;

truncate table users;



-- 2. available_policies

drop table policies;

CREATE TABLE policies (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  policy_name varchar(100) NOT NULL,
  detailed_name varchar(100) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=25;

INSERT INTO policies values(1,'Be Strong','Health Insurance Policy');
INSERT INTO policies values(2,'Clear White','Dental Insurance Policy');
INSERT INTO policies values(3,'EyeMed','Policy for eyes');
INSERT INTO policies values(4,'WithYouOnRoad','Policy for auto vehicles');
INSERT INTO policies values(5,'RideSafe','Insurance Policy for 2 wheelers');
INSERT INTO policies values(6,'NotJustLand','Policy For Boats and Ships');

select * from policies;

drop table user_policies;

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



INSERT INTO user_policies values(1,1,4,3090,'2020-10-15');
INSERT INTO user_policies values(2,3,4,3908,'2020-10-16');
INSERT INTO user_policies values(3,6,1,2014,'2020-10-17');
INSERT INTO user_policies values(4,6,2,2508,'2010-10-18');
INSERT INTO user_policies values(5,5,1,2838,'2020-10-19');
INSERT INTO user_policies values(6,1,4,2427,'2020-10-20');
INSERT INTO user_policies values(7,6,2,3955,'2015-10-21');
INSERT INTO user_policies values(8,2,3,3179,'2020-10-22');
INSERT INTO user_policies values(9,3,3,3652,'2020-10-23');
INSERT INTO user_policies values(10,2,4,2929,'2008-10-24');
INSERT INTO user_policies values(11,5,3,2845,'2020-10-25');
INSERT INTO user_policies values(12,3,5,4067,'2020-10-26');
INSERT INTO user_policies values(13,5,1,3888,'2020-10-27');
INSERT INTO user_policies values(14,3,1,3178,'2020-10-28');
INSERT INTO user_policies values(15,6,3,3561,'2002-10-29');
INSERT INTO user_policies values(16,2,1,3056,'2020-10-30');
INSERT INTO user_policies values(17,5,3,3069,'2020-10-31');
INSERT INTO user_policies values(18,2,3,2524,'2020-10-15');
INSERT INTO user_policies values(19,5,1,2458,'2020-10-05');
INSERT INTO user_policies values(20,4,1,2896,'2020-10-25');
INSERT INTO user_policies values(21,3,5,3266,'2020-06-30');
INSERT INTO user_policies values(22,4,2,3480,'2020-02-28');
INSERT INTO user_policies values(23,4,6,4580,'2015-02-28');

INSERT INTO user_policies values(24,4,7,14580,'2015-02-28');
INSERT INTO user_policies values(25,3,7,40,'2015-02-28');


select * from user_policies
WHERE 1=1
and user_id =6;



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
and up.user_id =7;

select up.id, p.policy_name, up.amount_paid, up.policy_end_date, u.first_name
from user_policies up, users u, policies p
WHERE 1=1
AND up.user_id = u.id
AND up.policy_id = p.id
and up.user_id =1;







