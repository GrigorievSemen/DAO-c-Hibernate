

CREATE TABLE PERSONS
(
    name           VARCHAR(255)       NOT NULL,
    surname        VARCHAR(255)       NOT NULL,
    age            int                NOT NULL,
    phone_number   VARCHAR(50) UNIQUE NOT NULL,
    city_of_living VARCHAR(100)       NOT NULL,
    PRIMARY KEY (name, surname, age)
);

INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living)
VALUES ('Коля', 'Петров', 26, '8-65-6541-9871', 'Москва'),
       ('Аня', 'Петров', 24, '5--4325-4657-4563', 'Псков'),
       ('Витя', 'Ромашкин', 56, '6-465-4978-4321', 'Москва'),
       ('Евгения', 'Жмурикова', 35, '5-2544-654-987', 'Владикавказ'),
       ('Роман', 'Козюлин', 55, '3-654-654-2451', 'Ярославль'),
       ('Оля', 'Резанцова', 18, '5-654-4571-987', 'Москва'),
       ('Леопольд', 'Котярин', 28, '1-654-1247-987', 'Котовск');
