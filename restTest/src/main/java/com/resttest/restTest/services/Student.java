package com.resttest.restTest.services;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private Long roll;
    private String name;
    private int batch;

    public Student() {
        super();
    }

    public Student(Long roll, String name, int batch) {
        this.roll = (long) roll;
        this.name = name;
        this.batch = batch;
    }

    public Long getRoll() {
        return roll;
    }

    public void setRoll(Long roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }
}
