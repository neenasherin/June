package edu.wbl.business;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsExample{
    int age,yer;
    String name;
    public CollectionsExample(int age,String name,int yer)
    {
this.age=age;
this.name=name;
this.yer=yer;
    }
    public static void main(String[] args)
    {
        CollectionsExample c1=new CollectionsExample(33,"neena",86);
        CollectionsExample c2=new CollectionsExample(36,"sherin",86);
        CollectionsExample c3=new CollectionsExample(8,"steven",86);
        ArrayList<CollectionsExample> arryList1=new ArrayList();
        arryList1.add(c1);
        arryList1.add(c2);
        arryList1.add(c3);

        Iterator itr2=arryList1.iterator();
        while(itr2.hasNext())
        {
            CollectionsExample   s= (CollectionsExample) itr2.next();
            System.out.println(s.age+s.name+s.yer);
        }

ArrayList<Integer> arryList=new ArrayList();
arryList.add(34);
        arryList.add(54);
        arryList.add(554);
        arryList.add(34534);

System.out.println(arryList);
//iterator
        Iterator itr=arryList.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        //forloop
        for(int i=0;i<arryList.size();i++)
        {
            System.out.println(arryList.get(i));
        }
        //for each loop
        for(Integer a:arryList)
        {
            System.out.println(a);
        }
        //foreach method
        arryList.forEach(a->{
            System.out.println(a);
        });
        //forEachRemaining method
        Iterator itr1=arryList.iterator();
        itr1.forEachRemaining(System.out::println);


        //serialize and deserializse

        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        try
        {
            //Serialization
            FileOutputStream fos=new FileOutputStream("file");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(al);
            System.out.println(oos);
            fos.close();
            oos.close();
            //Deserialization
            FileInputStream fis=new FileInputStream("file");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList  list=(ArrayList)ois.readObject();
            System.out.println(list);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
