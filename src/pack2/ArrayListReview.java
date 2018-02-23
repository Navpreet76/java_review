
package pack2;
import java.util.*;

public class ArrayListReview {

   
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<String>(); //Creating the Arraylist
        list.add("Michael");
        list.add("Jack");
        list.add("Trevor");
        list.add("Franklin");
        list.add("Link");
        
        //Traversing thru the arraylist with iterator
        
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
