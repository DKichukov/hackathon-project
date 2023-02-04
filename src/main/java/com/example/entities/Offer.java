package com.example.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "offers")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    @Column(length = 60)

    private String location;
    @OneToOne
    private Interest interest;
    @OneToOne
    private Opportunity opportunity;
    @ManyToOne
    private Business business;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "students_offers",
    joinColumns = {@JoinColumn(name = "student_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "offer_id",referencedColumnName = "id")})
    private Set<Student> students = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Interest getInterest() {
        return interest;
    }

    public void setInterest(Interest interest) {
        this.interest = interest;
    }

    public Opportunity getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
