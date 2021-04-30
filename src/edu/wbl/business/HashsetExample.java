package edu.wbl.business;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
    public static void main(String[] args)
    {

        HashSet<String> hs = new HashSet<>();

        // Elements are added using add() method
        hs.add("USA");
        hs.add("UK");
        hs.add("UAE");
        hs.add("UAE");
        // print the set elements
        System.out.println("HashSet elements : " + hs);
        hs.remove("USA");
        System.out.println("After removing element " +hs );
        System.out.println("Element USA exists in the Set : "
                + hs.remove("USA"));
        // Iterating hashset elements
        Iterator itr=hs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
