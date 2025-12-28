package com.skillnext;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int sem;
    private String departement;

    public Student() {}

    public Student(String name, int sem, String departement) {
        this.name = name;
        this.sem = sem;
        this.departement = departement;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSem() {
        return sem;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getDepartement() {
        return departement;
    }
    public void setDepartment(String departement) {
        this.departement = departement;
    }
}
