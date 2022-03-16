package com.masai;
import java.util.Scanner;

public class StringManipulator {
    public String removeVowels(String input) {
        if(input == null) {
            return null;
        }
        else  {
            String string = "";
            char[] str = input.toCharArray();

            for (int i = 0; i < str.length; i++) {
                if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                    continue;
                }
                string += str[i];
            }
            return string;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid string");

        String input = sc.next();
        StringManipulator x = new StringManipulator();
        String result = x.removeVowels(input);

        System.out.println(result);
    }
}
