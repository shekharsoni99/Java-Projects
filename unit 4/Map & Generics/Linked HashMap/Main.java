package com.mapAndGererics;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> lhm = new LinkedHashMap<>();

        lhm.put("Uttar Pradesh", "Lucknow");
        lhm.put("Bihar", "Patna");
        lhm.put("West Bengal", "Kolkata");
        lhm.put("Maharashtra", "Mumbai");
        lhm.put("Madhya Pradesh", "Bhopal");
        lhm.put("Rajasthan", "Jaipur");

        System.out.println(lhm);

        for (String state:lhm.keySet()) {
            System.out.println("State: " + state + " ,Capital: "+ lhm.get(state));
        }
    }
}
