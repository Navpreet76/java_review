
package pack2;
import java.util.*;

public class ArraylistLoopExample {

    
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<String>();
        list.add("Tarzan");
        list.add("Jane");
        list.add("Kobe");
        list.add("Lebron");
        list.add("Dwayne");
        
        //For each loop
        for(String s : list)
        {
            System.out.println(s);
        }
    }
    
}
