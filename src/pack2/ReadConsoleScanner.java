
package pack2;
import java.util.*;

public class ReadConsoleScanner {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Something : ");
        
        
        String input = scanner.nextLine();
        System.out.println("Your input is : " + input);
    }
    
}
