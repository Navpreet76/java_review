package javaapplication1;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample extends Frame implements ActionListener {
    TextField t1, t2, t3, t4;
    Label l1, l2, l3;
    Button b1, b2, b3;
    
    ActionListenerExample()
    {
        l1 = new Label("Enter First Number");
        l1.setBounds(50, 50, 100, 30);
        
        l2 = new Label("Enter Second Number");
        l2.setBounds(50, 100, 100, 30);
        
        l3 = new Label("Result is: ");
        l3.setBounds(50, 150, 100, 30);
        
        t1 = new TextField();
        t1.setBounds(250, 50, 100, 30);
    
        t2 = new TextField();
        t2.setBounds(250, 100, 100, 30);
        
        t3 = new TextField();
        t3.setBounds(250, 150, 100, 30);
        
        t4 = new TextField();
        t4.setBounds(250, 200, 100, 30);
        
        b1 = new Button("Add");
        b1.setBounds(50, 450, 100, 30);
    
        b2 = new Button("Subtract");
        b2.setBounds(200, 450, 100, 30);
        
        b3 = new Button("ABCD");
        b3.setBounds(200, 550, 100, 30);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(null);
        add(l1);
        add(t1);
        add(l2);
        add(l2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        
        setSize(600, 600);
        setVisible(true);
        
        
        
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            int z = x + y;
            t3.setText(z + "");
        }
        if(e.getSource()==b2)
        {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            int z = x + y;
            t3.setText(z +"");
            
        }
    }
    public static void main(String[] args) {
           
        ActionListenerExample obj = new ActionListenerExample();
    }
}
