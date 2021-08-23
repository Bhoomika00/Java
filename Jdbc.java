package jdbc;


import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//useSSL=true;
		String url="jdbc:mysql://localhost:3306/db";
		String usernm="root";
		String pass="root123";
		String query="select * from studentinfo";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,usernm,pass);
		Statement st=con.createStatement();
		ResultSet rs =st.executeQuery(query);
		System.out.println("ROllno:Name");
		while(rs.next())	
		{
			
			String Userdata = "";
			Userdata = rs.getInt(1) + ":" + rs.getString(2);
			System.out.println(Userdata);
			
		}
		
		
	    st.close();
	    con.close();
	    

	}

}
