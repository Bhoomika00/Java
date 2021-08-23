package com.sr;

//---- SERVER SIDE-----

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class sr_server {
	static ServerSocket Serversocket;
	static DataInputStream dis;
	static DataOutputStream dos;

	public static void main(String[] args) throws SocketException {

	try {
		int a[] = {  100,90,80,70,60,50,40,10,20,30 };
		Serversocket = new ServerSocket(9999);
		System.out.println("waiting for connection");
		Socket client = Serversocket.accept();
		System.out.println("Connection established...");
		dis = new DataInputStream(client.getInputStream());
		dos = new DataOutputStream(client.getOutputStream());
		System.out.println("The number of packets sent is:" + a.length);
		int y = a.length;
		dos.write(y);
		dos.flush();

		for (int i = 0; i < a.length; i++) {
			dos.write(a[i]);
			dos.flush();
		}

		int k = dis.read();

		dos.write(a[k]);
		dos.flush();

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				dis.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
//bhoomika bhagwat rfeugruggb
//close()hehbycatch exception generated catch block....


