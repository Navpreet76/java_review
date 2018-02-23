
package javaapplication1;
import java.util.*;

class Student
{
    int rollNo;
    String name;
    float marks;
    
    Student(int r, String n, float m)
    {
    
        rollNo = r;
        name = n;
        marks = m;
    }
    void showData()
    {
        System.out.println("Roll Number " + rollNo + " Name: " + name + " Marks : " + marks);
    }
}

public class ArrayList1 {

    
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        Student obj1 = new Student(101, "Michael", 89.06f);
        Student obj2 = new Student(102, "Jack", 99.06f);
        Student obj3 = new Student(103, "Michelle", 79.06f);
        
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            Student s = (Student)it.next();
            s.showData();
        }
      
    }
    
}
