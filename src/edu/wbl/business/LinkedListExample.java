package edu.wbl.business;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();

        //Adding elements at the end of the list

        list.add("JAVA");

        list.add("J2EE");

        list.add("JSP");

        list.add("SERVLETS");

        list.add("JDBC");
        System.out.println(list);
        list.addFirst("C++");
        System.out.println("Added at first ::  "+list);
        list.addLast("C");
        System.out.println("Added at last ::  "+list);
        list.poll();
        System.out.println("Deleted from head ::  "+list);
        list.remove(2);
        System.out.println("2nd index element removed ::  "+list);
        list.pollFirst();
        System.out.println("Delete from head ::  "+list);
       System.out.println("Searching ::  "+ list.contains("JDBC"));
        //LinkedList has pop() and push() methods which make LinkedList to function as a Stack.
        list.push("JDBC");
        System.out.println(list);
        list.push("hfbfbh");
        System.out.println(list);
        list.pop();
        System.out.println(list);
       // Using lastIndexOf() method, we can retrieve the position of last occurrence of a given element in a LinkedList.
       // Using clone() method of LinkedList class. This method creates shallow copy of the original LinkedList.
       //Using clear() method. This method removes all elements of a LinkedList.
       // Use the removeFirstOccurrence(Object 0) to remove the first occurrence of a given element
        // and use removeLastOccurrence(Object 0) to remove last occurrence of a given element in a LinkedList
    }
}
