package com.mapAndGererics;

import java.util.*;

public class StateAndStudentMap {
    public static void main(String[] args) {

        Map<String, Student> map = new HashMap<>();

        map.put("Delhi", new Student(45, "Krishna", 980));
        map.put("Kolkata", new Student(12, "shiva", 1000));
        map.put("UP", new Student(1, "Radhe", 650));
        map.put("Bihar", new Student(4, "Ram", 400));
        map.put("MP", new Student(60, "Maruti", 544));

        Set<Map.Entry<String, Student>> set = map.entrySet();

        List<Map.Entry<String, Student>> list = new ArrayList<>(set);

        Collections.sort(list, new SortByMarks());

        for(Map.Entry<String,Student> me:list) {
            System.out.println("State name is: " + me.getKey());
            System.out.println(me.getValue());
        }
    }
}
