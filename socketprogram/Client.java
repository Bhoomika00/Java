package com.socketprogram;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		
		try {
			Socket s=new Socket("localhost",5000);
			
			DataInputStream din= new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            String msgin="",msgout="";
			
			while(!msgin.equals("")) {
				msgout=br.readLine();
				dout.writeUTF(msgout);
				msgin=din.readUTF();
				System.out.println(msgin); //printing sever msg
			}
			
			
		}catch(Exception e) {
			
		}

	}



}
