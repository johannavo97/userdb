package com.perscholas.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Department implements Serializable {
    static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int did;
    String dname;
    @ToString.Exclude
    @OneToMany(targetEntity = Teacher.class, cascade = {CascadeType.ALL})
    List teacherList;

    public Department() {
    }

    public Department(int did, String dname) {
        super();
        this.did = did;
        this.dname = dname;

    }
}
