package com.mapAndGererics;
import java.util.Comparator;
import java.util.Map;

public class SortByMarks implements Comparator<Map.Entry<String, Student>> {

    @Override
    public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
        Student s1 = o1.getValue();
        Student s2 = o2.getValue();

        return s1.getMarks() > s2.getMarks() ? 1:-1;
    }
}
