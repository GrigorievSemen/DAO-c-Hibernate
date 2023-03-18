package ru.grigoriev.dao_withh_hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
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

    @Column(name = "city_of_living", nullable = false)
    private String city;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
}


