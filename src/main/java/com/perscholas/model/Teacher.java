package com.perscholas.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
@Entity
@Table
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Teacher implements Serializable {
    static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tit;
    String teacherName;
    String salary;

//    @ManyToOne
//    @JoinColumn(name = "department_did")
//    Department department;

    public Teacher(int tit, String teacherName,String salary) {
        super();
        this.tit = tit;
        this.teacherName = teacherName;
        this.salary = salary;

    }

    public Teacher() {
    }


}
