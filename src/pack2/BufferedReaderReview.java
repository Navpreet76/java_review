
package pack2;
import java.io.*;


public class BufferedReaderReview {

    
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Something: ");
            String input = br.readLine();
            System.out.println("Your input is : " + input);
        } catch (Exception e) {
            System.out.println(e);
        }
                                          
    }
    
}
