
package pack2;
import java.util.*;

public class TreeSetExampleReview {

    
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(99);
        t.add(87);
        t.add(67);
        t.add(53);
        t.add(44);
        t.add(19);
        t.add(66);
//        Iterator it = t.iterator();
        Iterator it = t.descendingIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
