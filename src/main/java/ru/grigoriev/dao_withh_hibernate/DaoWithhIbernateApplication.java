package ru.grigoriev.dao_withh_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DaoWithhIbernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaoWithhIbernateApplication.class, args);
    }

}
