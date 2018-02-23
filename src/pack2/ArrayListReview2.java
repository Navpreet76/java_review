
package pack2;
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
        System.out.println(" Roll Number " + rollNo + " Name " + name + " Marks " + marks);
        
    }
}
public class ArrayListReview2 {

    
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        Student obj1 = new Student(345, "Bruce", 98.78f);
        Student obj2 = new Student(444, "Clark", 89.05f);
        Student obj3 = new Student(555, "Peter", 78.09f);
        
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
