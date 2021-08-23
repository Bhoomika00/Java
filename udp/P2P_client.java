package com.udp;

import java.net.*;
import java.nio.charset.StandardCharsets;
import java.io.*;  
 

public class P2P_client {
		
	public static void main(String args[])throws Exception{  
		
			DatagramSocket datagramSocket = new DatagramSocket(4444);
            System.out.println("Connected to server....");	 
			
			InetAddress receiverAddress = InetAddress.getLocalHost();
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   byte[] buffer;
			String str="";  
			while(!str.equals("byee")){  
				str=br.readLine();  
				buffer = str.getBytes();
				DatagramPacket packet = new DatagramPacket(
				        buffer, buffer.length, receiverAddress, 5555);
				datagramSocket.send(packet);
	 
				//for receiving
				byte[] buffer1 = new byte[1024];
		DatagramPacket packet1 = new DatagramPacket(buffer1, buffer1.length);
	 
				datagramSocket.receive(packet1);
				buffer1 = packet1.getData();
				String str1 = new String(buffer1, StandardCharsets.UTF_8);
				System.out.println("S: "+str1);
	 
			}  
	 
		}
	}



