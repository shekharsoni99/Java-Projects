package com.masai;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Employee> ts = new TreeSet<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Employee Id: " + (i+1));
            int empId = sc.nextInt();

            System.out.println("Enter Employee name: " + (i+1));
            String empName = sc.next();

            System.out.println("Enter Employee salary: " + (i+1));
            double salary = sc.nextInt();
            ts.add(new Employee(empId, empName, salary));
        }

        for (Employee tse:ts) {
            System.out.println(tse);
        }
    }
}
