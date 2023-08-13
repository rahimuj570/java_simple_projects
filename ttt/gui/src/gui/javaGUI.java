package gui;

import javax.swing.*;

public class javaGUI {
	
	javaGUI(){
		
		JFrame f = new JFrame();
		JLabel fname = new JLabel("First Name");
		fname.setBounds(20,50,80,20);
		
		JLabel lname = new JLabel("Last Name");
		lname.setBounds(20,80,80,20);
		
		JLabel dob = new JLabel("Date of Birth");
		dob.setBounds(20,110,80,20);
		
		JTextField fnTF = new JTextField();
		fnTF.setBounds(120,50,100,20);
		
		JTextField lnTF = new JTextField();
		lnTF.setBounds(120,80,100,20);
		
		JTextField dobTF = new JTextField();
		dobTF.setBounds(120,110,100,20);
		
		JButton s = new JButton("Submit");
		s.setBounds(20,160,100,30);
		
		JButton r = new JButton("Reset");
		r.setBounds(80,180,100,30);
		
		f.add(fname);
		f.add(lname);
		f.add(dob);
		f.add(fnTF);
		f.add(lnTF);
		f.add(dobTF);
		f.add(s);
		f.add(r);
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
	}
	
	public static void main(String [] args)
	{
		javaGUI j = new javaGUI();
	}

}
