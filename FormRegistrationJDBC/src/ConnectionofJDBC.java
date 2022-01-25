import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionofJDBC {
    public static void main(String args[]){

  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  
  String firstname,lastname,email;
  int id,cnt=0;

  Connection con;
  PreparedStatement pst;
  ResultSet rs;

  try{
   
    
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","mysql");

   pst = con.prepareStatement("select * from leads1 where id=?");
   
    do{

          System.out.println("Enter id");
          id = Integer.parseInt(br.readLine());
          pst.setInt(1,id);
          rs = pst.executeQuery();
          cnt = 0;
          while(rs.next())
     {
        cnt++;
        System.out.println(rs.getString(2)+"\t"+rs.getString(4));
     }
          if(cnt ==0 && id>0)
          System.out.println("Record dont existes");
    }while(id>0);
 
  System.out.println(" reords searched Successfully");
  pst.close();
  con.close();
 }
  catch(Exception ex){

   System.out.println(ex);
  }
 }
}
