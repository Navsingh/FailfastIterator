import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.xml.soap.SOAPPart;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {
    public static  void  main(String args[])
    {
        //**********************************Fail Fast Collections***********************\\
       /* ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Nav");
        arrayList.add("Singh");
        arrayList.add("Lamme");
        Iterator<String> PersonDetails = arrayList.iterator();
        try {
           System.out.println(PersonDetails.next());
           System.out.println(PersonDetails.next());
           arrayList.remove(1);  //Concurrent Modification Error  //replace it by iterator.remove will solve the problem
           //PersonDetails.remove();  //Uncomment it to see the effect
           System.out.println(PersonDetails.next());
            }
        catch(ConcurrentModificationException e)
        {
            System.out.println("Error is "+e);
        }
        System.out.println("Size after deletion is "+arrayList.size());
        for(String data : arrayList)
        {
            System.out.println(data);
        }
        //Same concept applied on HashMap
        //**********************************Iterator.remove()***********************\\
        //It provides the solution to above problem
        //**********************************Fail Safe Collections***********************\\
        // 1) CopyOnWriteArrayList  2)ConcurrentHashMap

        //**Code of Fail Safe collection
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();  //create separate copy each time element added or removed from list
        copyOnWriteArrayList.add("NavSingh");
        copyOnWriteArrayList.add("lamme");
        copyOnWriteArrayList.add("SoftwareEngineer");
        Iterator iterator = copyOnWriteArrayList.iterator();
        System.out.println(iterator.next());
        copyOnWriteArrayList.remove("lamme");
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println("Size of list "+copyOnWriteArrayList.size());
        Iterator iterator1 = copyOnWriteArrayList.iterator();
        while (iterator1.hasNext())
        System.out.println(iterator1.next());
        //System.out.println(iterator1.next());
       // System.out.println(iterator1.next());
       // System.out.println("Size of list "+copyOnWriteArrayList.size());

        // 2) ConcurrentHashMAap
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("name","Navjot");
        concurrentHashMap.put("Profession","Developer");
        for(Map.Entry<String,String>entry:concurrentHashMap.entrySet())
        {

            System.out.println(entry.getValue());
            concurrentHashMap.put("Country","Canada");
            concurrentHashMap.remove("name","Navjot"); //to see it's effect print content of map again

        }
        for(Map.Entry<String,String>entry:concurrentHashMap.entrySet())
        {

            System.out.println(entry.getValue());
        }*/
        student student = new student();
        student student1 = new student(2);
      //  student student2 = new student();
        student student2 = student;
        System.out.println("Both object equal  student and student1 "+student.equals(student1));
        System.out.println("Both objects student and student2 equal "+student.equals(student2));
        System.out.println("Both objects student and student2 equal(==) "+(student==student2));
        //System.out.println("Hascodes following "+ student.hashCode()+"Student1 "+student1.hashCode());
        String firstName = new String("Navjot");
        String lastName = new String("Navjot");
        System.out.println("Strings equals(==) "+ (firstName == lastName));
        System.out.println("Strings equals(.equal()) "+firstName.equals(lastName));


    }
    public static class  student
    {
      int id;
      student()
      {
          id = 1;
      }
      student(int id)
      {
          this.id = id;
      }

     /*   @Override
        public boolean equals(Object obj) {
             if(obj instanceof student)
            {
                student student12 = (student) obj;
                if(this.id==student12.id)
                {
                    return  true;
                }
            }
                   return  false;
            }*/
    }
}
