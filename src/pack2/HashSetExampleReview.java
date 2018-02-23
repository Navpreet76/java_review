/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;
import java.util.*;

public class HashSetExampleReview {

    
    public static void main(String[] args) {
        HashSet<String>hset = new HashSet<String>();
        
        //Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Banana");
        hset.add("Peach");
        hset.add("Grapes");
        hset.add("Fig");
        
        //Addition of duplicate elements
        hset.add("Mango");
        hset.add("Banana");
        hset.add("Grapes");
        
        //Addition of Null values
        hset.add(null);
        hset.add(null);
        
        //Displaying Hashset Elements
        System.out.println(hset);
    }
    
}
