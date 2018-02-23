
package javaapplication1;
import java.util.*;

public class HashmapExample {

   
    public static void main(String[] args) {
        HashMap obj = new HashMap();
        int indexes[] = {5,6,7,8,9,10};
        //(key, value pair)
        obj.put(5, "Keyboard");
        obj.put(6,"Mouse");
        obj.put(7, "Kitchen Sink");
        obj.put(8, "Wrench");
        obj.put(9, "Cellphone");
        obj.put(10, "Vehicle");
        for(int i = 0; i < indexes.length; i++)
        {
            System.out.println(obj.get(indexes[i]));
        }
    }
        
}
