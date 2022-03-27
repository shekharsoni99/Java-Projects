package com.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private int roll;
    private String name;

    private String email;
    transient private String password;

    public Student() {
    }

    public Student(int roll, String name, String email, String password) {
        this.roll = roll;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
