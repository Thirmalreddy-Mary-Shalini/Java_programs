package ex10;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class gui4 extends JFrame implements ItemListener {
	JLabel l1,l2;
	String s[]= {"DSA","COA","AI","Math"};
	JComboBox c1;
	JTextField t1;
	gui4(){
		l1=new JLabel("Select Subject");
		l2=new JLabel("Subject name");
		c1=new JComboBox(s);
		t1=new JTextField(15);
		add(l1);
		add(c1);
		add(l2);
		add(t1);
		setVisible(true);
		setSize(250,200);
		setTitle("dfgh");
		setLayout(new FlowLayout());
		
		c1.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==c1) {
			Object x=c1.getSelectedItem();
			String y=x.toString()	;
			t1.setText(y);
		
		}
		
	}
}
public class EX10_4 {

	public static void main(String[] args) {
		gui4 f=new gui4();

	}

}
