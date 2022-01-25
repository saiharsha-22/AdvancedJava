import java.awt.*;
import javax.swing.*;

public class Form {

  public static void main(String arrgs[]) {
    JFrame f = new JFrame("employee details");
    JLabel l1 = new JLabel("name:");
    f.add(l1);
    JTextField t1 = new JTextField(30);
    f.add(t1);
    JLabel l2 = new JLabel("id:");
    f.add(l2);
    JTextField t2 = new JTextField(30);
    f.add(t2);
    JLabel l3 = new JLabel("password");
    f.add(l3);
    JPasswordField pwd = new JPasswordField(30);
    f.add(pwd);
    JLabel l4 = new JLabel("gender");
    f.add(l4);
    JRadioButton r1 = new JRadioButton("male");
    JRadioButton r2 = new JRadioButton("female");
    ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    f.add(r1);
    f.add(r2);
    f.setVisible(true);
    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(10, 2));
  }
}
