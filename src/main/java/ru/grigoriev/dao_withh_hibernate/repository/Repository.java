package ru.grigoriev.dao_withh_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.grigoriev.dao_withh_hibernate.entity.Person;
import ru.grigoriev.dao_withh_hibernate.entity.PersonIdentity;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, PersonIdentity> {
    List<Person> findByCity(String city);

    List<Person> findByPersonIdentity_AgeLessThanOrderByPersonIdentity_Age(int age);

    Optional<Person> findPersonByPersonIdentity_NameAndPersonIdentity_Surname(String name, String surname);
}
