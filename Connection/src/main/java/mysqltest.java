
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.*;
public class mysqltest {
    public static void main(String arrgs[])
	{
                Connection con;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","mysql");
		if(con!=null)
			{
			System.out.println("sucessfull");
			}
			else
			{
				System.out.println("unsucessfull");
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
