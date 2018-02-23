/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

public class CalendarExample {

    
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        System.out.println("MONTH: " + (calendar.get(Calendar.MONTH)+1));
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
        
    }
    
}
