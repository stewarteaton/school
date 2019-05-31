-- This script creates a table with various field types.

DROP TABLE IF EXISTS people;

-- Create the table

CREATE TABLE people (
  PersonID int NOT NULL auto_increment,
  FirstName varchar(20),
  LastName varchar(40),
  Birthdate date,
  BirthCity varchar(45),
  BirthState varchar(20),
  Region varchar(25),
  PRIMARY KEY (PersonID)
)ENGINE=InnoDB; 

DROP TABLE IF EXISTS admins;

CREATE TABLE admins (
	id int NOT NULL auto_increment,
	username varchar(50) NOT NULL,
	hashed_password varchar(60) NOT NULL,
	PRIMARY KEY (id)
)ENGINE=InnoDB;

-- Populate the tablec

insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("George", "Washington", "1732-02-22", "Westmoreland", "VA", "South");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("James", "Bond", "1977-07-07", "Mystery Island", "Vanuatu", "Caribbean");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("George W.", "Bush", "1946-07-06", "New Haven", "CT", "Northeast");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("Michael", "Jordan", "1963-02-17", "Brooklyn", "NY", "Northeast");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("Bo", "Derek", "1956-11-20", "Long Beach", "CA", "West");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("Oprah", "Winfrey", "1954-01-29", "Kosciusko", "MS", "South");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("Molly", "Ringwald", "1968-02-18", "Roseville", "CA", "West");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("Michael", "Jackson", "1958-08-29", "Gary", "IN", "Midwest");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("George", "Orwell", "1903-06-25", "Motihari", "India", "East Asia");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("Lee", "Majors", "1939-04-23", "Wyandotte", "MI", "Midwest");
insert into people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region) values ("Kevin", "Bacon", "1958-07-08", "Philadelphia", "PA", "Northeast");
