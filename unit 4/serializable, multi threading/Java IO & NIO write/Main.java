package com.Write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("abc.txt");
        fw.write("Hello World");
        fw.write("\n");
        fw.write("India");
        fw.write("\n");
        fw.write("Hello World");
        fw.write("\n");
        fw.write("India");

        fw.flush();
        fw.close();

        System.out.println("Done");
    }
}
