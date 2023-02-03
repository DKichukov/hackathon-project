package com.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String firstName;
   private String lastName;
   private String email;
   private int age;
   private String city;
   private Status status;



}
