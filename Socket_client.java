package com.sdl;


import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
public class Socket_client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String ip="localhost";
		int port=9999;
		Socket s=new Socket(ip,port);
		
		System.out.println("Client started");
		BufferedReader userip= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int number=Integer.parseInt(userip.readLine());
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println(number);
		System.out.println("What is factorial of given number?");
		
		
		BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(in.readLine());
	
	}

}
