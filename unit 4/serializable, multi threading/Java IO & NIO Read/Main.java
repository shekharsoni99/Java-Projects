package com.Read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        Method 1
//        FileReader fileReader = new FileReader("abc.txt");
//
//        int i = fileReader.read();
//
//        while (i != -1) {
//            System.out.println((char) i);
//            i = fileReader.read();
//        }

//        Method 2

        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);

        char[] chars = new char[(int) file.length()];

        fileReader.read(chars);

        for (char c:chars)
            System.out.println(c);
    }
}
