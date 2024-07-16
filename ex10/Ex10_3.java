package ex10;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class gui1 extends JFrame implements ItemListener{
	JLabel l1;
	JRadioButton r1,r2,r3;
	gui1(){
		l1=new JLabel("Please choose your fav lang :");
		r1=new JRadioButton("Java");
		r2=new JRadioButton("ASP.net");
	    r3=new JRadioButton("SQL");
	    ButtonGroup bg=new ButtonGroup(); 
	    bg.add(r1);
	    bg.add(r2);
	    bg.add(r3);
	    
	    add(l1);
	    add(r1);
	    add(r2);
	    add(r3);
		setVisible(true);
		setSize(290,300);
		setTitle("Demo");
		setLayout(new FlowLayout());
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==r1) {
			if(e.getStateChange()==1) {
			JOptionPane.showMessageDialog(this," Java option has been selected","message",JOptionPane.INFORMATION_MESSAGE);
		}
		}
		else if(e.getSource()==r2) {
			if(e.getStateChange()==1) {
			JOptionPane.showMessageDialog(this,"ASP.net option has been selected","message",JOptionPane.INFORMATION_MESSAGE);
		}
		}
		else {
			if(e.getStateChange()==1) {
			JOptionPane.showMessageDialog(this,"SQL option has been selected","message",JOptionPane.INFORMATION_MESSAGE);
		}
		}
	}
}
public class Ex10_3 {

	public static void main(String[] args) {
		gui1 f=new gui1();
	}

}
