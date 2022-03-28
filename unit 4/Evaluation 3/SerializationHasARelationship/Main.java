package com.evaluation3.SerializationHasARelationship;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Serialized

        Employee employee = new Employee("Uttar Pradesh", "Lucknow", "340986", "4432", "Ramesh", "ramesh@gmail.com", "12345");

        FileOutputStream fos = new FileOutputStream("emp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(employee);

        oos.flush();
        oos.close();

        System.out.println("Serialization is done...");

//        Deserialized

        FileInputStream fis = new FileInputStream("emp.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = ois.readObject();

        Employee employee1 = (Employee) obj;
        System.out.println("Employee object details after Deserialization is: " + employee1);

        System.out.println("Deserialization is done successfully...");
    }
}
