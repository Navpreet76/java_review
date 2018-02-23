package javaapplication1;
import java.util.*;
import java.io.*;


public class StudentInputRecords {
    public static void main(String[] args) {
        try {
            String name[] = new String[5];
            int rollNo[] = new int[5], marks[] = new int[5], classname[] = new int[5];
            Scanner input1 = new Scanner(System.in);
            File f = new File("c:\\");
            PrintWriter p = new PrintWriter(f);
            for(int i = 0; i < 5; i++)
            {
                System.out.println("Please Enter your Name: ");
                name[i] = input1.nextLine();
                System.out.println("Please enter your Roll Number");
                rollNo[i] = Integer.parseInt(input1.nextLine());
                System.out.println("Please enter your Marks");
                marks[i] = Integer.parseInt(input1.nextLine());
                System.out.println("Enter your Grade");
                classname[i] = Integer.parseInt(input1.nextLine());
                p.write(name[i] + " " + rollNo[i] + " " + marks[i] + " " + classname[i]);
                
             }
            p.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
