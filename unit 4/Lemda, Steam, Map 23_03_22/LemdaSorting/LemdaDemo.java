package com.functionInferfaceDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LemdaDemo {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Delhi");
        cities.add("Ahmedabad");
        cities.add("Hyderabad");
        cities.add("Lucknow");
        cities.add("Patna");

        Collections.sort(cities, (c1, c2) -> c2.compareTo(c1));

        System.out.println(cities);

        cities.forEach(i -> System.out.println(i));
    }
}