package secondProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SecondProject extends JFrame{

	boolean edite=false;
	JLabel header,id,name,classes;
	JTextField idF,nameF,classF;
	Font headFont=new Font("Arial",Font.BOLD,20);
	Font labelFont=new Font("Arial",Font.BOLD,13);
	JButton saveBtn,editBtn,deletBtn;
	DefaultListModel dm=new DefaultListModel(); 
	JList list = new JList(dm);
	SecondProject(){
		initComponent();
		otherComponent();
	}
	
	//Initial Components
	void initComponent() {
		this.setBounds(500, 100, 500, 500);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void otherComponent() {
		header=new JLabel("Second Project");
		header.setBounds(175,10,200,30);
		header.setFont(headFont);
		header.setForeground(Color.RED);
		this.add(header);
		
		//--------Label Start
		name=new JLabel("Your Name :");
		name.setBounds(10,100,100,30);
		name.setFont(labelFont);
		this.add(name);
		
		id=new JLabel("Your ID:");
		id.setBounds(10,140,100,30);
		id.setFont(labelFont);
		this.add(id);
		
		name=new JLabel("Your Name :");
		name.setBounds(10,180,100,30);
		name.setFont(labelFont);
		this.add(name);
		//--------Label End
		
		//---------Input Start
		nameF=new JTextField();
		nameF.setBounds(130,100,200,30);
		this.add(nameF);
		
		idF=new JTextField();
		idF.setBounds(130,140,200,30);
		this.add(idF);
		
		classF=new JTextField();
		classF.setBounds(130,180,200,30);
		this.add(classF);
		//----------input End
		
		//---------Button Start
		saveBtn=new JButton("SAVE");
		saveBtn.setBounds(180, 220, 100, 20);
		saveBtn.addActionListener(handler);
		this.add(saveBtn);
		
		editBtn = new JButton("EDIT");
		editBtn.addActionListener(handler);
		editBtn.setBounds(156, 386, 89, 23);
		this.add(editBtn);
		
		deletBtn = new JButton("DELETE");
		deletBtn.setBounds(257, 386, 89, 23);
		deletBtn.addActionListener(handler);
		this.add(deletBtn);
		//---------Button end
		
		//------list and scroll
		DefaultListCellRenderer renderer =  (DefaultListCellRenderer)list.getCellRenderer();  
		renderer.setHorizontalAlignment(JLabel.CENTER);
		JScrollPane sp = new JScrollPane(list,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setViewportView(list);
		sp.setBounds(100, 275, 300, 100);
		this.add(sp);
	}
	
	//-------- Event Listener
	class Handler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==saveBtn) {
				if(nameF.getText().length()!=0 && idF.getText().length()!=0 && classF.getText().length()!=0) {
				dm.addElement(nameF.getText()+" ~~~ "+idF.getText()+" ~~~ "+classF.getText());
				nameF.setText("");
				classF.setText("");
				idF.setText("");}else {
					JOptionPane warn=new JOptionPane();
					warn.showMessageDialog(warn, "Input All The Data!", "Empty Field Not Allowed", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(e.getSource()==deletBtn) {
				JOptionPane confrm=new JOptionPane();
				int f=confrm.showConfirmDialog(confrm, "Are You Sure to Delete This! ","test",JOptionPane.YES_NO_OPTION);
				if(f==0) {
				int indx=list.getSelectedIndex();
				dm.removeElementAt(indx);}
			}else {
				String tmp=list.getSelectedValue().toString();
				int sz=tmp.length();
				int f1=0,f2=0;
				String n="",id="",c="";
				for(int i=0; i<sz; i++) {
					if(f1==0) {
						char tmpC=tmp.charAt(i);
						if(tmpC=='~') {
							i+=3;
							f1=1;
							continue;
						}
						n=n+tmp.charAt(i);
					}else if(f2==0) {
						char tmpC=tmp.charAt(i);
						if(tmpC=='~') {
							i+=3;
							f2=1;
							continue;
						}
						id=id+tmp.charAt(i);
					}else {
						c=c+tmp.charAt(i);
					}
				}
				if(edite==false) {					
					editBtn.setText("DONE");
					editBtn.setBackground(Color.green);
					nameF.setBackground(Color.green);
					classF.setBackground(Color.green);
					nameF.setText(n.strip());
					idF.setEditable(false);
					idF.setText(id);
					classF.setText(c.strip());
					edite=true;
					saveBtn.setEnabled(false);
					deletBtn.setEnabled(false);
				}else {
					editBtn.setBackground(null);
					nameF.setBackground(null);
					classF.setBackground(null);
					editBtn.setText("EDITE");
					edite=!edite;
					idF.setEditable(true);
					saveBtn.setEnabled(true);
					deletBtn.setEnabled(true);
					int indx=list.getSelectedIndex();
					dm.set(indx,nameF.getText()+" ~~~ "+id.strip()+" ~~~ "+classF.getText());
					nameF.setText("");
					classF.setText("");
					idF.setText("");
				}
			}
			
		}
		
	}
	Handler handler=new Handler();
	
	public static void main(String args[]) {
		SecondProject sp=new SecondProject();
	}
}
