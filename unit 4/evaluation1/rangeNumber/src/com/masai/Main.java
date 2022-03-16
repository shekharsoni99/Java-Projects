package com.masai;
import java.util.Scanner;

public class Main {
    public String rangeNumbers(int start, int end, int inc) {
        if(end < start || inc < 0) {
            return "Error";
        }
        else {
            String str = "";
            for (int i = start; i <= end; i += inc) {
                str += i + " ";
            }
            return str;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers... Start, end & increment");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int inc = sc.nextInt();

        Main m1 = new Main();
        String result = m1.rangeNumbers(start, end, inc);
        System.out.println(result);
    }
}
