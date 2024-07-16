package ex10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class gui extends JFrame implements ActionListener{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1;
	
	gui(){
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		t1=new JTextField(20);
		p1=new JPasswordField(20);
		b1=new JButton("Login");
		add(l1);
		add(t1);
		add(l2);
		add(p1);
		add(b1);
		setVisible(true);
		setSize(350,300);
		setLayout(new FlowLayout());
        setTitle("swing application");
        
       b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String q=t1.getText();
		String p=p1.getText();
		if(e.getSource()==b1) {
			if((q.equals("Karunya"))&&(p.equals("Karunya"))) {
				JOptionPane.showMessageDialog(this,"Login Successful","Message",JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(this,"LoginFailed","Message",JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
}












public class Ex10_1 {

	public static void main(String[] args) {
		gui f=new gui();

	}

}
