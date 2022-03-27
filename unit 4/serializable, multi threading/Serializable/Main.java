package com.serial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Student student = new Student(332, "Shekhar Soni", "shekharsoni99@gmail.com", "12345");
        Address address = new Address("Uttar Pradesh", "Ballia", "277001");
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student);
//        studentList.add((Student) address);

        FileOutputStream fos = new FileOutputStream("student.txt", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student);
        oos.writeObject(address);
        oos.flush();
        oos.close();

        System.out.println("Student class is serialized");
    }
}
