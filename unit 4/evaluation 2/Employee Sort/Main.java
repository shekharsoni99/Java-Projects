package com.masai;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<Employee> ts = new TreeSet<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Employee Id");
            int empId = sc.nextInt();

            System.out.println("Enter Employee name");
            String name = sc.next();

            System.out.println("Enter Employee address");
            String address = sc.next();

            System.out.println("Enter Employee salary");
            double salary = sc.nextInt();

            ts.add(new Employee(empId, name, address, salary));
        }

        for (Employee e:ts) {
            System.out.println(e);
        }
    }
}
