package com.deserialized;

import com.serial.Address;
import com.serial.Student;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = ois.readObject();

        Student student = (Student) obj;
        System.out.println(student);

//        Address address = (Address) obj;
//        System.out.println(address);
    }
}
