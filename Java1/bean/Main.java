package bean;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the roll number");
        int roll = sc.nextInt();

        System.out.println("Enter name of student");
        String name = sc.next();

        System.out.println("Enter marks of student");
        int marks = sc.nextInt();

        JavaBean student = new JavaBean(roll, name, marks);
//        JavaBean student = new JavaBean();
//        student.setRollNumber(roll);
//        student.setStudentName(name);
//        student.setMarks(marks);

        System.out.println("Student Roll Number: " + student.getRollNumber());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Marks: " + student.getMarks());
    }
}
