CREATE TABLE if not exists PERSONS
(
    name           VARCHAR(255)       NOT NULL,
    surname        VARCHAR(255)       NOT NULL,
    age            int                NOT NULL,
    phone_number   VARCHAR(50) UNIQUE NOT NULL,
    city_of_living VARCHAR(100)       NOT NULL,
    PRIMARY KEY (name, surname, age)
);


