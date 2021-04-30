package edu.wbl.business;

import java.util.Iterator;
import java.util.LinkedHashSet;
 class Customer
{
   public String name;

    int id;

    public Customer(String name, int id)
    {
        this.name = name;

        this.id = id;
    }

 /*  @Override
    public int hashCode()
    {
        return name.hashCode();
    }

@Override
    public boolean equals(Object obj)
    {
        Customer customer = (Customer) obj;

        return ( name.equals( customer.name));
    }


   /* @Override
    public String toString()
    {
        return id+" : "+name;
    }

*/
}
public class LinkedHashsetExample {
    public static void main(String args[]){
        LinkedHashSet<String> al=new LinkedHashSet<String>();
        al.add("Neena");
        al.add("Monica ");
        al.add("Joylsna");
        al.add("Neena");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedHashSet<Customer> set = new LinkedHashSet<Customer>();

        //Adding elements to LinkedHashSet

        set.add(new Customer("Neena", 10));

        set.add(new Customer("Joylsna", 10));

        set.add(new Customer("Monica", 30));

        set.add(new Customer("Neena", 10));

        set.add(new Customer("sujatha", 50));      //Duplicate Element

        set.add(new Customer("Ahmad", 60));

        set.add(new Customer("shija", 70));

        set.add(new Customer("Joylsna", 21));



        //Getting Iterator object

        Iterator<Customer> it = set.iterator();
//set.add(new Customer("Joylsna1", 21));
        while (it.hasNext())
        {

            Customer customer = (Customer) it.next();

            System.out.println(customer);
            System.out.println(customer.name.hashCode());
        }

    }


}
