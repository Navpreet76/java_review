
package javaapplication1;
import java.util.*;
public class HashsetExample {

    
    public static void main(String[] args) {
       HashSet<String>hset = new HashSet<String>(); //Create Hashset
       
       //Adding elements to the Hashset
       hset.add("Apple");
       hset.add("Banana");
       hset.add("Mango");
       hset.add("Grapes");
       hset.add("Kiwi Fruit");
       hset.add("Pineapple");
       
       //Adding Duplicate elements
       hset.add("Apple");
       hset.add("Banana");
       hset.add("Orange");
       
       //Adding null values
       
       hset.add(null);
       hset.add(null);
       
       //Displaying Hashset elements
       System.out.println(hset);
    };
    
}
