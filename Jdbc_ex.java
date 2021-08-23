package com.sdl;


/*(This is like the Call Connection)
 * Steps in the JDBC
 * 1.Import package for JDBC -> java.sql
 * 2. a)Load the Driver  ---> com.mysql.cj.jdbc.driver
 * 	  b)Register the Driver
 * 3.Established the connection -->Connection(Interface)
 * 4. Create the Statement --> Statement (interface)
 * 5.Execute the Query
 * 6.Process the Result
 * 7.close
 */

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Jdbc_ex {
	
	public static void main(String[] args) throws Exception{
		
		char ans ;
		
		do {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Rollno. to insert into database");
			int a = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the Name of student to insert into the database.. ");
			String b = sc.nextLine();
			
		
			
			System.out.println("Do u want to continue inserting data (y/n)");
			ans = sc.next().charAt(0);
			
			Update(a,b);
			show();
			
		}while(ans != 'n');
			
			 
		}

	private static void Update(int userid , String username) throws Exception {
			
			String url = "jdbc:mysql://localhost:3306/db";
			String uname = "root";
			String pass = "root123";
			
			
			String query1 = "INSERT INTO studentinfo values (?,?)";
			
			Class.forName("com.mysql.cj.jdbc.Driver");//register a driver
			Connection con = DriverManager.getConnection(url, uname, pass);
			
			PreparedStatement st = con.prepareStatement(query1);
			
			
			st.setInt(1,userid);
			st.setString(2, username);
			
			
			int count =  st.executeUpdate(); 
			System.out.println(count+" rows Affected");
			
		}

	private static void show() throws Exception{
			
			String url = "jdbc:mysql://localhost:3306/db";
			String uname = "root";
			String pass = "root123";
			String query = "SELECT * FROM db.studentinfo  ";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			
			Statement st = con.createStatement();
			ResultSet rs =  st.executeQuery(query);
			
			System.out.println("Rollno : Name");
			while(rs.next())	
			{
				
				String Userdata = "";
				Userdata = rs.getInt(1) + " : " + rs.getString(2);
				System.out.println(Userdata);
				
			}
			st.close();
			con.close();
				
			
			
			
		}
		
		

	}
