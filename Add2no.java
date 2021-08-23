package applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Event.*;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("unused")
public class Add2no extends Applet{
	
	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */

	
	

	    private Label ans=new Label("Result");
	   private Label num2label=new Label("Enter the second  number");
	   private Label num1label=new Label("Enter the first number");
	   private TextField num1=new TextField(5);
	   private TextField num2=new TextField(5);
	   private TextField result=new TextField(5);
	   private Button btn=new Button("ADD");
	   
	    public void init() {
	        
	        this.setLayout(new FlowLayout());
	        add(num1label);
	        add(num1);
	        add(num2label);
	        add(num2);
	        add(btn);
	        add(ans);
	        add(result);
	      
	        btn.addActionListener(new ActionListener()
	        {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                  int no1=Integer.parseInt(num1.getText());
	                  int no2=Integer.parseInt(num2.getText());
	                 int res=sum(no1,no2);
	                result.setText(""+res);
	                result.setEnabled(false);
	            }
	        }
	        );
	        
	        
	    }
	    public int sum(int a,int b)
	    {
	       return a+b;
	    }
	}



