create database Student;
use Student;
create table Students(
id int not null auto_increment primary key,
name varchar(255) not null,
email varchar(255) not null,
dateOfBirt date not null,
address varchar(255) not null,
phone varchar(255) not null,
classroom varchar(255)
);
insert into students (name,email,dateOfBirt, address, phone,classroom) values
("le minh son", "son123@gmail.com", "1998-07-05", "ha noi","0977710979", "12a3"),
("nguyen van tuan", "tuan123@gmail.com", "1998-07-05", "ha nam","0977710976", "12a4"),
("le van minh", "minh123@gmail.com", "1998-07-05", "nam dinh","0977710900", "12a5"),
("nguyen nhung", "nhung123@gmail.com", "1998-07-05", "yen nghia","0977710966", "12a6"),
("le duc", "duc123@gmail.com", "1998-07-05", "ha nam","0977710977", "12a7");
drop table Students;
select * from students where id = 4;
