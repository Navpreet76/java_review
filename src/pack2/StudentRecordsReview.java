
package pack2;
import java.util.*;

public class StudentRecordsReview {

    
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter your Roll number : ");
            int rollNo = input.nextInt();
            input.nextLine();
            System.out.println("Enter your Marks : ");
            float marks = input.nextFloat();
            input.nextLine();
            System.out.println("Enter your City");
            String city = input.nextLine();
            System.out.println();
            
            System.out.println("Name is " + name);
            System.out.println("Roll Number is " + rollNo);
            System.out.println("Marks are " + marks);
            System.out.println("City is "+ city);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
