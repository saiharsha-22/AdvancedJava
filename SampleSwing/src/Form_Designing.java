import java.awt.GridLayout;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Form_Designing {
    public static void main(String args[]){
     JFrame f = new JFrame("Register-Details");
    JLabel l1 = new JLabel("Name");
    f.add(l1);
    JTextField t1 = new JTextField(30);
    f.add(t1);
    JLabel l2 = new JLabel("email-id");
    f.add(l2);
    JTextField t2 = new JTextField(30);
    f.add(t2);
    JLabel l3 = new JLabel("Adress");
    f.add(l3);
    JTextArea t3 = new JTextArea();
    f.add(t3);
    JLabel l4 = new JLabel("Mobileno");
    f.add(l4);
    JTextField t4 = new JTextField(30);
    f.add(t4);
    JLabel l5 = new JLabel("password");
    f.add(l5);
    JPasswordField p = new JPasswordField(30);
    f.add(p);
    f.setSize(400,400);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(9,2));
    
    }  
}
