package com.Write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWrite {
    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("abc.txt"));

        bufferedWriter.write("Hello my name is Ramesh");
        bufferedWriter.newLine();
        bufferedWriter.write("This is India");
        bufferedWriter.newLine();
        bufferedWriter.write("How are you?");
        bufferedWriter.newLine();

        char[] ch = {'a', 'b', 'c'};
        bufferedWriter.write(ch);

        bufferedWriter.flush();
        bufferedWriter.close();

        System.out.println("Done");
    }
}
