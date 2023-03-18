package ru.grigoriev.dao_withh_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.grigoriev.dao_withh_hibernate.entity.Person;
import ru.grigoriev.dao_withh_hibernate.entity.PersonIdentity;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository <Person, PersonIdentity> {
    @Query ("select p from Person p where p.city = :city")
    List<Person> findByCity(@Param("city") String city);
    @Query ("select p from Person p where p.personIdentity.age < :age order by p.personIdentity.age")
    List<Person> findByAge(int age);
    @Query ("select p from Person p where p.personIdentity.name = :name and p.personIdentity.surname = :surname")
    Optional<Person> findByNameSurname(String name, String surname);
}
