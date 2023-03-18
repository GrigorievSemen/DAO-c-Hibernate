package ru.grigoriev.dao_withh_hibernate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.grigoriev.dao_withh_hibernate.entity.Person;
import ru.grigoriev.dao_withh_hibernate.exception.NotFoundException;
import ru.grigoriev.dao_withh_hibernate.repository.Repository;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class Controller {
    private final Repository repository;

    @GetMapping("/by-city")
    @ResponseBody
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return repository.findByCity(city);
    }

    @GetMapping("/by-age")
    @ResponseBody
    public List<Person> getPersonsByAge(@RequestParam("age") int age) {
        return repository.findByPersonIdentity_AgeLessThanOrderByPersonIdentity_Age(age);
    }

    @GetMapping("/by-name-surname")
    @ResponseBody
    public Optional<Person> getPersonsByNameSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return Optional.ofNullable(repository.findPersonByPersonIdentity_NameAndPersonIdentity_Surname(name, surname)
                .orElseThrow(() -> new NotFoundException("Person not found.")));
    }
}


