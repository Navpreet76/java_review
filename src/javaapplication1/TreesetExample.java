
package javaapplication1;
import java.util.*;

public class TreesetExample {

    
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(100);
        t.add(76);
        t.add(56);
        t.add(28);
        t.add(88);
        t.add(12);
        t.add(67);
//        Iterator it = t.iterator();
        Iterator it = t.descendingIterator(); //Sorted in Descending order
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
