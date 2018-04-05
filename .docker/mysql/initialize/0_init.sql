DROP DATABASE IF EXISTS `demo`;
CREATE DATABASE demo CHARACTER SET utf8;
CREATE USER demo IDENTIFIED BY 'demo';
GRANT ALL PRIVILEGES ON demo.* TO 'demo'@'localhost' IDENTIFIED BY 'demo' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON demo.* TO 'demo'@'%' IDENTIFIED BY 'demo' WITH GRANT OPTION;
FLUSH PRIVILEGES;