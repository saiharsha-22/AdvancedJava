import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class SimpleButton {
    public static void main(String args[]){
        JFrame f = new JFrame("simpleButton");
        JButton b = new JButton("click-me");
        b.setBackground(Color.green);
        b.setBounds(50,100,95,30);
       
        f.add(b);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
