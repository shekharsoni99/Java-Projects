package com.Read;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIORead {
    public static void main(String[] args) throws IOException {
        Path paths = Paths.get("abc.txt");

        Stream<String> str = Files.lines(paths);

        System.out.println("Reading from the file");

        str.forEach(line -> System.out.println(line));
    }
}
