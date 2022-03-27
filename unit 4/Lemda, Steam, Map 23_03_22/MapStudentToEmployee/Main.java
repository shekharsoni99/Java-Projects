package com._230322;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(10, "Ram", 470));
        studentList.add(new Student(1, "Shyam", 890));
        studentList.add(new Student(3, "Hari", 770));
        studentList.add(new Student(6, "Rakesh", 870));
        studentList.add(new Student(8, "Joy", 540));

        List<Employee> employeeList = new ArrayList<>();

//        for (Student s:studentList) {
//            employeeList.add(new Employee(s.getRoll(), s.getName(), s.getMarks()*1000));
//        }

        Stream<Student> studentStream = studentList.stream();


        List employeeList1 = studentStream.map(s -> new Employee(s.getRoll(), s.getName(), s.getMarks()*1000)).collect(Collectors.toList());
        System.out.println(employeeList1);

        employeeList1.forEach(student -> System.out.println(student));
//        studentStream.forEach(i -> {
//            employeeList.add(new Employee(i.getRoll(), i.getName(), i.getMarks()*1000));
//        });

//        employeeList.forEach(i -> System.out.println(i));
    }
}
