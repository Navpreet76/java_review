
package javaapplication1;
import java.awt.*;

public class ChoiceExample {
    ChoiceExample(){
        Frame f = new Frame("Choice Example");
        Choice c = new Choice();
        
        c.setBounds(100, 100, 150, 75);
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");
        c.add("Item 5");
        c.add("Item 6");
        f.add(c);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
      ChoiceExample c = new ChoiceExample();
    }
    
}
