package com.example.entities;

public enum Status {
    TRAiNEE ("trainee"),
    LEARNER ("learner"),
    UNLEARNER ("unleaner");

    private String stat;

    Status(String stat) {
        this.stat = stat;
    }
}
