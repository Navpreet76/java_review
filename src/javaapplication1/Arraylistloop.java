
package javaapplication1;
import java.util.*;

public class Arraylistloop {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Niko");
    list.add("Michael");
    list.add("Franklin");
    list.add("James");
    list.add("Trevor");
    
    for(String s : list)
    {
        System.out.println(s);
    }
    
    }
    
}
