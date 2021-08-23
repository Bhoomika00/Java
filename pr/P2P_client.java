/* peer to peer chat or one to one chat*/
package com.pr;

import java.net.*;
import java.io.*;  

public class P2P_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s=new Socket("127.0.0.1",3003);
		System.out.println("Connection establised");
		
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String str="",str2="";  
		while(!str.equals("byee")||str.equals("Byee")){  
			str=br.readLine();  
			dout.writeUTF(str);  
			dout.flush();  
			str2=din.readUTF();  
			System.out.println("Server: "+str2);  
		}  
	  
		dout.close();  
		s.close();  

	}

}
