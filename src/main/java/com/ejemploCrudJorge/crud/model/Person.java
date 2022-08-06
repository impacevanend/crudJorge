package com.ejemploCrudJorge.crud.model;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    private int age;

}
