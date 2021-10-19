CREATE TABLE springsecurity.user
(id INT NOT NULL,
 user_name VARCHAR(45) NOT NULL,
 password VARCHAR(45) NOT NULL,
 active TINYINT NULL,
 roles VARCHAR(45) NOT NULL
 );