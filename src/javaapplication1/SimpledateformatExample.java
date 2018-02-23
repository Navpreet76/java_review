
package javaapplication1;
import java.util.*;
import java.text.*;

public class SimpledateformatExample {

   
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);
    }
    
}
