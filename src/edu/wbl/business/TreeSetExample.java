package edu.wbl.business;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        //Creating a TreeSet

        TreeSet<String> set = new TreeSet<>();

        //Adding elements to TreeSet

        set.add("Neena");

        set.add("Joylsna");

        set.add("Monica");

        set.add("Neena");

        //Getting Iterator object

        Iterator<String> it = set.iterator();

        //Modifying the TreeSet after getting Iterator object

      //  set.add("shija");

        while (it.hasNext())
        {
            //This statement will throw ConcurrentModificationException

            System.out.println(it.next());
        }
    }
}