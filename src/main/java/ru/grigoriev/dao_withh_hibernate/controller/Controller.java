package ru.grigoriev.dao_withh_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.grigoriev.dao_withh_hibernate.entity.Person;
import ru.grigoriev.dao_withh_hibernate.repository.Repository;

import java.util.List;

@RestController
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getProduct(@RequestParam("city") String city) {
        return repository.getPersonsByCity(city);
    }
}


