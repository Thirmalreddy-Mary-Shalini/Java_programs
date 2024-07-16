package ex10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class gui2 extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JLabel l1;
	JTextArea a1;
	gui2(){
		b1=new JButton("YES");
		b1.setSize(340,100);
		b2=new JButton("NO");
		b2.setSize(340,100);
		b3=new JButton("CLOSE");
		b3.setSize(340,100);
		//a1=new JTextArea(10,30);
		l1=new JLabel();
		//l2=new JLabel();
		//l3=new JLabel();
		add(b1);
		add(b2);
		add(b3);
		add(l1);
	
		//add(a1);
		setVisible(true);
		setSize(350,300);
		setTitle("dfgh");
		setLayout(new FlowLayout());
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s=b1.getText();
		String s2=b2.getText();
		if(e.getSource()==b1) {
			l1.setText("Yes is pressed");
		}
		else if(e.getSource()==b2) {
			l1.setText("no is pressed");
		}
		else {
			dispose();	
			
		}
		
	}
}
public class Ex10_2 {

	public static void main(String[] args) {
	gui2 f=new gui2();

	}

}
