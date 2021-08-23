package com.fp;

import java.io.*;
import java.net.*;

public class fpServer {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		System.out.println("Waiting for clientsss....");
		ServerSocket ss=new ServerSocket(5000);
		Socket s=ss.accept();
		System.out.println("Connection Established...");
		
		//FileInputStream fr=new FileInputStream("D:\\Users\\User\\Documents\\servertext.txt");

        
        //Specify the file
        File file = new File("D:\\\\Users\\\\User\\\\Documents\\\\servertext.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis); 
          
        //Get socket's output stream
        OutputStream os = s.getOutputStream();
                
        //Read File Contents into contents array 
        byte[] contents;
        long fileLength = file.length(); 
        long current = 0;
         
        long start = System.nanoTime();
        while(current!=fileLength){ 
            int size = 10000;
            if(fileLength - current >= size)
                current += size;    
            else{ 
                size = (int)(fileLength - current); 
                current = fileLength;
            } 
            contents = new byte[size]; 
            bis.read(contents, 0, size); 
            os.write(contents);
            System.out.print("Sending file ... "+(current*100)/fileLength+"% complete!");
        }   
        
        os.flush(); 
        //File transfer done. Close the socket connection!
        s.close();
        ss.close();
        System.out.println("File sent succesfully!");
    }


	}


