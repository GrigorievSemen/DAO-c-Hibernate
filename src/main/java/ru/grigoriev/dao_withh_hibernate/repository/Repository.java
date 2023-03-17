package ru.grigoriev.dao_withh_hibernate.repository;

import ru.grigoriev.dao_withh_hibernate.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    private final String GET_PERSONS_BY_CITY = "select p from Person p where p.city_of_living = :city";

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(GET_PERSONS_BY_CITY, Person.class).setParameter("city", city).getResultList();
    }
}
