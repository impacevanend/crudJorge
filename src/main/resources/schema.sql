CREATE TABLE IF NOT EXISTS Person
(
    PersonId INTEGER NOT NULL AUTO_INCREMENT,
    FirstName varchar(30) NOT NULL,
    LastName varchar(30),
    Age int,
    PRIMARY KEY (PersonId)
    );