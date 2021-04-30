package edu.wbl.business;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);

        list.add(10);

        list.add(50);

        list.add(40);
        System.out.println(list);
        //sort elements
        Collections.sort(list);
        System.out.println("Sorted ArrayList  ::  "+list);


        //get();
        System.out.println("Index 3rd Element" + "::" + list.get(3));
        //set();
        list.set(2, 70);
        System.out.println("Element set at 2nd index ::" +list );

        System.out.println(list.size());

        //Removing an element at index 0

        list.remove(0);

        System.out.println(list.size());

       //Adding elements to ArrayList

        list.add(100);

        list.add(null);

        list.add(2000);

        list.add(null);

        list.add(null);

        //ArrayList having 3 null elements

        System.out.println(list);


    }
}

