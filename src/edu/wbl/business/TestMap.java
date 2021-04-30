package edu.wbl.business;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
//hashmap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(4, "four");
        map.put(0, "zero");
        map.put(-10, "minus ten");
        map.put(5, "five");
        map.put(5, "another five");
        System.out.println(map.get(4));
        System.out.println( map.containsKey(2));
        map.forEach((k, v) -> System.out.println(k + " = " + v));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        for (Integer key : map.keySet()) {
            System.out.println("Key = " + key);
        }
     /*   //treemap
        SortedMap<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);
        for (Map.Entry<Integer, String> entry1 : sortedMap.entrySet()) {
            System.out.println("Key = " + entry1.getKey() + ", Value = " + entry1.getValue());
        }
        for (Integer key : sortedMap.keySet()) {
            System.out.println("Key = " + key);
        }
        //Linkedhashmap
        Map<Integer, String> lMap = new LinkedHashMap<>(map);
        System.out.println(lMap);
        for (Map.Entry<Integer, String> entry2 : lMap.entrySet()) {
            System.out.println("Key = " + entry2.getKey() + ", Value = " + entry2.getValue());
        }
        for (Integer key : lMap.keySet()) {
            System.out.println("Key = " + key);
        }
        */

    }
}