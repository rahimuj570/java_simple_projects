package testSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TestSwing extends JFrame{
	String s[]= {"Email Here...","Password Here...","IUS... ... ..."};
	JLabel uniTxt,passTxt,mailTxt;
	JTextField uniF,passF,mailF;
	JButton uniBtn,loginBtn,resetBtn;
	Font font=new Font("Arial",Font.BOLD,20);
	Font placeholder=new Font("Arial",Font.ITALIC,15);
	TestSwing(){
		initComponent();
		otherComponents();
	}
	
	
	
	class Handler implements FocusListener{
		public void focusGained(FocusEvent e) {
			JTextField jt=(JTextField)(e.getSource());
			//System.out.println(jt.getText());
			if(jt.getText().equals(s[0]) || jt.getText().equals(s[1]) || jt.getText().equals(s[2])) {
				if(e.getSource()==mailF) {mailF.setText("");}
				else if(e.getSource()==passF)passF.setText("");
				else uniF.setText("");
			}
		}
		public void focusLost(FocusEvent e) {
			JTextField jt=(JTextField)(e.getSource());
			//System.out.println(jt.getText());
			if(jt.getText().length()==0) {
				if(e.getSource()==mailF)mailF.setText("Email Here...");
				else if(e.getSource()==passF)passF.setText("Password Here...");
				else uniF.setText("IUS... ... ...");
			}
		}}
	
	Handler handler=new Handler();
	
	
	
	class Act implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==resetBtn) {
				passF.setText("Password Here...");
				uniF.setText("IUS... ... ...");
				mailF.setText("Email Here...");
			}
			else if(e.getSource()==loginBtn)JOptionPane.showMessageDialog(rootPane, "Welcome!\nYour Email: "+mailF.getText()+"\nYour Password: "+passF.getText());
			
		}
		
	}
	Act act=new Act();
	
	
void initComponent() {
	this.setBounds(20,20,300,350);
	this.setLayout(null);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

void otherComponents() {
	uniTxt=new JLabel("University Name",JLabel.CENTER);
	uniTxt.setBounds(0,20,280,50);
	uniTxt.setFont(font);
	this.add(uniTxt);
	
	uniF=new JTextField("IUS... ... ...");
	uniF.setBounds(40,60,200,30);
	uniF.setHorizontalAlignment(JTextField.CENTER);
	uniF.addFocusListener(handler);
	this.add(uniF);
	
	uniBtn=new JButton("Check");
	uniBtn.setBounds(40,90,200,30);
	this.add(uniBtn);
	
	mailF=new JTextField("Email Here...");
	mailF.setBounds(40,150,200,30);
	mailF.setFont(placeholder);
	mailF.addFocusListener(handler);
	this.add(mailF);

	passF=new JTextField("Password Here...");
	passF.setBounds(40,185,200,30);
	passF.setFont(placeholder);
	passF.addFocusListener(handler);
	this.add(passF);

	loginBtn=new JButton("Login");
	loginBtn.setBounds(40,220,80,30);
	loginBtn.addActionListener(act);
	this.add(loginBtn);
	
	resetBtn=new JButton("Reset");
	resetBtn.setBounds(160,220,80,30);
	resetBtn.setBackground(Color.RED);
	resetBtn.setForeground(Color.WHITE);
	resetBtn.setBorderPainted(false);
	resetBtn.addActionListener(act);
	this.add(resetBtn);
}




	public static void main(String args[]) {
		TestSwing t=new TestSwing();
		
	}


}