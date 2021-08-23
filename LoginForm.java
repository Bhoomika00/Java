package applet;


import java.applet.Applet;
//import java.applet.AppletViewer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginForm extends Applet implements ActionListener {
	
		private static final long serialVersionUID = 1L;
		TextField t1=new TextField(10);
		TextField t2=new TextField(10);
		Label lb1=new Label("Enter Username");
		Label lb2=new Label("Enter Password");
		Button btn1=new Button("Login");
		Button btn2=new Button ("Exit");
		{
			btn1.addActionListener((ActionListener) this);
			btn2.addActionListener(this);
			t2.setEchoChar('*');
			add(lb1);
			add(t1);
			add(lb2);
			add(t2);
			add(btn1);
			add(btn2);
		}
		public void actionPerformed(ActionEvent click)
		{
			if(click.getSource()==btn1) {
				if((t1.equals("Bhoomika"))&&(t2.equals("12345")))
				{
					JOptionPane.showMessageDialog(null,"Welcome!!","Login Complete",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Wrong username or password","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		
	}


