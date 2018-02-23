
package javaapplication1;
import java.util.*;
public class ArraylistExample2 {

    
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<String>();//Create Array list
        list.add("Nick");//Adding objects to array list
        list.add("Navpreet");
        list.add("Michelle");
        list.add("Clive");
        list.add("Nancy");
        //Traversing through the list with Iterator
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    
    
    
    
    }
    
}
