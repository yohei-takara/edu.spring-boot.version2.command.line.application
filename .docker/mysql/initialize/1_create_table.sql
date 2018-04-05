create table demo.personal(
  `id` INT,
  `name` varchar(20),
  `birthday` DATETIME DEFAULT '2018-01-01 00:00:00'
);


insert into personal (id, name, birthday) values (1, 'suzuki', '1900-01-01 00:10:00');
insert into personal (id, name, birthday) values (2, 'sato', '2000-01-01 00:10:00');
insert into personal (id, name, birthday) values (3, 'yamada', '2010-01-01 00:10:00');
