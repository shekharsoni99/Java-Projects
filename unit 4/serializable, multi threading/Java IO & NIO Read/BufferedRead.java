package com.Read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =new BufferedReader(new FileReader("abc.txt"));

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
