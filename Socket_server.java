package com.sdl;

import java.net.*;
import java.io.*;

public class Socket_server{
	public static void main(String[] args) throws IOException {
		
		System.out.println("WAiting for clients....");
		ServerSocket ss =new ServerSocket(9999);
		Socket s= ss.accept();
		System.out.println("Connection Established..");
		
		BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
		int number=Integer.parseInt(in.readLine());
		PrintWriter out =new PrintWriter(s.getOutputStream(),true);
		
		out.println("Factorial of "+number+" is:" +calfactorial(number) );
		System.out.println("Factorial of "+number+" is:" +calfactorial(number));
		
	}
	static int calfactorial(int number) {
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
