package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int roll;
    String name;
}
public class ArrayListPractice {

    public static void main(String[] args) {
        //list1 contains only String type object
        ArrayList<String> list1= new ArrayList<String>();   //type specific

        //list2 contains any type of object
        ArrayList list2= new ArrayList();    //any type of data


        Student s= new Student();
        s.roll=10;
        s.name="Asik";

        //1. Add data in list1
        list1.add("Asif"); //0
        list1.add("Nazim");  //1
        list1.add("Khaled"); //2
        //list1.add(10);  //error
       // list1.add(20);  //error

        list2.add("Ashik");
        list2.add(10);
        list2.add(10.30);
        list2.add(s.roll);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        //print both list
        System.out.println("List1 is:"+ list1);
        System.out.println("List2 is:"+ list2);

        //2. get the element from list
        String name= list1.get(1);
        System.out.println("Name is :" + name);

        Object o = list2.get(1);
        System.out.println("object is : "+ o);

        //3. Update element in list
        list1.set(0,"Ashik");
        System.out.println("List1 now is "+ list1);

        //4. Remove element from list
        list1.remove(2);
        System.out.println("List1 now is "+ list1);

        //list1.clear() -->remove all element

        //5. search element
        if(list1.contains("Ashik")){
            System.out.println("Ashik exsists in list");
        }
        //6. iterate in arraylist
        System.out.println("iteration with enhance for loop");
        for(String itr: list1){
            System.out.println(itr);
        }
        System.out.println("===============");
        System.out.println("Iteration with iterator");
        Iterator<String> itr= list1.iterator();
        while(itr.hasNext()){
            String str= itr.next();
            System.out.println(str);
        }
        System.out.println("===================");
    }
}
