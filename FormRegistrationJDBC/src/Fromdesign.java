
import com.mysql.cj.protocol.Resultset;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static jdk.nashorn.internal.runtime.Debug.id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user new
 */
public class Fromdesign {
     public static void main(String arrgs[])
{

JFrame f=new JFrame("employee details");
JLabel l1=new JLabel("name:");
f.add(l1);
final JTextField t1=new JTextField(30);
f.add(t1);
JLabel l2=new JLabel("id:");
f.add(l2);
final JTextField t2=new JTextField(30);
f.add(t2);
JLabel l3=new JLabel("Address");
f.add(l3);
final JTextArea area=new JTextArea();
f.add(area);


/*JLabel l4=new JLabel("gender");
f.add(l4);
JRadioButton r1=new JRadioButton("male");
JRadioButton r2=new JRadioButton("female");
ButtonGroup bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
f.add(r1);
f.add(r2);*/
JButton fb = new JButton("submit");

f.add(fb);
f.setVisible(true);
f.setSize(500,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(new GridLayout(10,2));

 
   fb.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
         Connection con;
      PreparedStatement pst;
     
  
     String name = t1.getText() , address =  area.getText();
     String id =  t2.getText();
     int cnt =0;
        try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","mysql");
    
   pst = con.prepareStatement("insert into form values(?,?,?)");

   pst.setString(1,name);
   pst.setString(2,id);
   pst.setString(3,address);
   
  cnt = pst.executeUpdate();

   if(cnt>0){
   System.out.print("name:\n"+name+"\n"+"id:\n"+id+"\n"+"address:\n"+address);
   System.out.println("updated succefully");
   }
   else
   {
   System.out.println("updation failed");
   }
        }catch(Exception ex){
                 System.out.print(ex);
           }
        }  
    });
 }
}
