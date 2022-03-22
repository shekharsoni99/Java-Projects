package com.functionInferfaceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(10, "Ram", 470));
        list.add(new Student(1, "Shyam", 890));
        list.add(new Student(3, "Hari", 770));
        list.add(new Student(6, "Rakesh", 870));
        list.add(new Student(8, "Joy", 540));

        List<Student> anotherList = list.stream().filter(s -> s.getMarks() < 800).collect(Collectors.toList());
        anotherList.forEach(i -> System.out.println(i));

//        Stream<Student> studentMarksLessThan800 = list.stream().filter(s -> s.getMarks() < 800);
//        studentMarksLessThan800.forEach(i -> System.out.println(i));
    }
}
