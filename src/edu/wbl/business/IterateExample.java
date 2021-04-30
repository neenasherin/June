package edu.wbl.business;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateExample {
    public static void main(String[] args) {
        ArrayList<Integer> arryList = new ArrayList();
        arryList.add(34);
        arryList.add(54);
        arryList.add(554);
        arryList.add(34534);

        System.out.println(arryList);
        //iterator
        Iterator itr = arryList.iterator();
        while (itr.hasNext()) {
            System.out.println("Iterator Interface ::  "+itr.next());
        }
        //forloop
        for (int i = 0; i < arryList.size(); i++) {
            System.out.println("for loop  ::  "+arryList.get(i));
        }
        //for each loop
        for (Integer a : arryList) {
            System.out.println("forEach loop  ::  "+a);
        }
        //foreach method
        arryList.forEach(a -> {
            System.out.println("forEach()  ::  "+a);
        });
        //forEachRemaining method
        Iterator itr1 = arryList.iterator();
        itr1.forEachRemaining(System.out::println);
    }
}