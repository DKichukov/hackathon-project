package com.example.entities;

import javax.persistence.*;

@Entity
public class Seeking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Student student;
    @OneToOne
    private Opportunity opportunity;
    @OneToOne
    private Interest interest;


}
