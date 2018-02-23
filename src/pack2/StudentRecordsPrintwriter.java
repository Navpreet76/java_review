
package pack2;
import java.io.*;
import java.util.*;

public class StudentRecordsPrintwriter {

    
    public static void main(String[] args) {
        try {
            String name[] = new String[5];
            int rollNo[] = new int[5], marks[] = new int[5], classname[] = new int[5];
            Scanner input = new Scanner(System.in);
            File f = new File("c:\\textout.txt");
            PrintWriter p = new PrintWriter(f);
            for(int i = 0; i < 5; i++)
            {
                System.out.println("Please enter your name ");
                name[i] = input.nextLine();
                System.out.println("Please enter your Roll Number");
                rollNo[i] = Integer.parseInt(input.nextLine());
                System.out.println("Please enter your marks ");
                marks[i] = Integer.parseInt(input.nextLine());
                System.out.println("Please Enter your class");
                classname[i] = Integer.parseInt(input.nextLine());
                p.write(name[i] + " " + rollNo[i] + " " + marks[i] + " " + classname[i]);
                
                }
                p.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
