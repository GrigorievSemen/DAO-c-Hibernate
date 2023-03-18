package ru.grigoriev.dao_withh_hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@Entity
public class Person implements Serializable {
    @EmbeddedId
    private PersonIdentity personIdentity;
//    @Id
//    private String name;
//    @Id
//    private String surname;
//    @Id
//    private int age;
    @Column(name = "city_of_living", nullable = false)
    private String city;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
}


