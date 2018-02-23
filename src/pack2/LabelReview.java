
package pack2;
import java.awt.*;

public class LabelReview {

    
    public static void main(String[] args) {
         Frame f = new Frame("Label Review");
         Label l1, l2;
         TextField t1;
         Checkbox c1, c2;
         c1 = new Checkbox("C++");
         c1.setBounds(200, 200, 100, 50);
         c2 = new Checkbox("Java", true);
         c2.setBounds(200, 250, 100, 50);
         t1 = new TextField("Hello World");
         t1.setBounds(50, 250, 100, 30);
         l1 = new Label("First Label");
         l1.setBounds(50, 100, 100, 30);
         l2 = new Label("Second Label");
         l2.setBounds(50, 150, 100, 30);
         f.add(c1);
         f.add(c2);
         f.add(t1);
         f.add(l1);
         f.add(l2);
         f.setSize(500, 500);
         f.setLayout(null);
         f.setVisible(true);
         
    }
    
}
