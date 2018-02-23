
package javaapplication1;
import java.awt.*;

public class TextfieldExample {

    
    public static void main(String[] args) {
        Frame f = new Frame("Text Field Example");
        TextField t1;
        t1 = new TextField("Hello Java");
        t1.setBounds(50, 100, 200, 30);
        
        f.add(t1);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
