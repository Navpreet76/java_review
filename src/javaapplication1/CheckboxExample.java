/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.*;

public class CheckboxExample {

    
    public static void main(String[] args) {
        Frame f = new Frame("Check Box Example");
        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100, 100, 100, 50);
        Checkbox checkbox2 = new Checkbox("Java", true);
        checkbox2.setBounds(100, 150, 100, 50);
        Checkbox checkbox3 = new Checkbox("C#");
        checkbox3.setBounds(100, 200, 100, 50);
        Checkbox checkbox4 = new Checkbox("PHP");
        checkbox4.setBounds(100, 250, 100, 50);
        
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(checkbox3);
        f.add(checkbox4);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
