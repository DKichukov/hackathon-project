package com.example.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

   private String password;

   @ManyToMany(mappedBy = "students")
   private Set<Offer> offers = new HashSet<>();

   @ManyToMany(mappedBy = "students")
   private Set<Opportunity> opportunities = new HashSet<>();

   @ManyToMany(mappedBy = "students")
   private Set<Interest> interests = new HashSet<>();

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public Status getStatus() {
      return status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public Set<Offer> getOffers() {
      return offers;
   }

   public void setOffers(Set<Offer> offers) {
      this.offers = offers;
   }

   public Set<Opportunity> getOpportunities() {
      return opportunities;
   }

   public void setOpportunities(Set<Opportunity> opportunities) {
      this.opportunities = opportunities;
   }

   public Set<Interest> getInterests() {
      return interests;
   }

   public void setInterests(Set<Interest> interests) {
      this.interests = interests;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
}
