
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JLabel;


public class sender extends JFrame{
	
private static final long serialVersionUID = 1L;
private JLabel ip;
private JTextField tf;

	public sender(){
		super ("IP Address");
		
		tf=new JTextField();
		ip=new JLabel("Enter IP Address");
		tf.setSize(100, 20);
		ip.setToolTipText("This is where you enter the IP Address");
		add(ip);
		add(tf);
		
	}
}
