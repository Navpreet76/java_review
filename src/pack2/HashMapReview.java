
package pack2;
import java.util.*;

public class HashMapReview {

   
    public static void main(String[] args) {
        HashMap obj = new HashMap();
        int indexes[] = {5,6,7,8,9,10};
        
        //(Key, Value) Pairs
        obj.put(5, "Keyboard");
        obj.put(6, "Mouse");
        obj.put(7, "Kitchen Sink");
        obj.put(8, "Bubble Gum");
        obj.put(9, "Police Baton");
        obj.put(10, "Air Max 95s");
//        System.out.println(obj.get(9));
        //Displaying items using for loop
        for(int i = 0; i < indexes.length; i++)
        {
            System.out.println(obj.get(indexes[i]));
            
        
        }
        
    }
    
}
