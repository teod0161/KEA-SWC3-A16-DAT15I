package dk.kea.swc3.week35.adt;

import java.util.*;

/**
 * Created by coag on 02-09-2016.
 */
public class RunMap {

    public static void main(String[] args) {
        Map<Integer, List<String>> grades = new Hashtable<>();

        grades.put(12, new ArrayList<>());
        grades.get(12).add("Alice");
        grades.get(12).add("Cay");
        grades.put(0, new ArrayList<>());
        grades.get(0).add("Claus");
        grades.get(0).add("Alex");

        System.out.println(grades);
        /*
        12: Alice, Cay
        0: Claus, Alex
         */
        Set<Integer> keys = grades.keySet();
        for (Integer key: keys) {
            String output = "";
            output += key + ": ";
            List<String> names = grades.get(key);
            for (String name: names) {
                output += name + ", ";
            }
            output = output.substring(0, output.lastIndexOf(","));
            System.out.println(output);
        }

    }
}