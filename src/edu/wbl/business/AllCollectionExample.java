package edu.wbl.business;


import java.util.*;

public class AllCollectionExample {

    public static void main(String[] args) {

        // array list
        List<Integer> integers = Arrays.asList(7,2,6,4,5,7,3,1,0,-20);
        System.out.println("ArrayList :: "+integers);


        // linked list
        List<Integer> llIntegers = new LinkedList<>(integers);
        System.out.println("Linkedlist ::  "+llIntegers);

        // hash set
        Set<Integer> sIntegers = new HashSet<>(integers);
        System.out.println("hashSet ::  "+sIntegers);
       // sIntegers.forEach(System.out::println);



        // tree set
        SortedSet<Integer> tsIntegers = new TreeSet<>(sIntegers);
        System.out.println("treeSet  ::  "+tsIntegers);

        // linked hash set
        Set<Integer> lsIntegers = new LinkedHashSet<>(integers);
        System.out.println("linkedHashSet  ::  "+lsIntegers);


    }
}
