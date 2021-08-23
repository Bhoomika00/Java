package com.pr;

import java.net.*;
import java.io.*;

public class P2P_server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Waiting for clients.....");
		ServerSocket ss=new ServerSocket(3003);  
		Socket s=ss.accept(); 
		System.out.println("Connection Established...");
		
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String str="",str2="";  
		while(!str.equals("byee")||str.equals("Byee")){  
			str=din.readUTF();  
			System.out.println("Client:"+str);  
			str2=br.readLine();  
			dout.writeUTF(str2);  
			dout.flush();  
		}  
		din.close();  
		s.close();  
		ss.close();  


	}

}
