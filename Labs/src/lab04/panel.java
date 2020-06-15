package lab04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class panel extends JPanel implements ActionListener {
/// variables ////
	
	private JButton button;
	private JTextArea display;
	private Double sqrt;
	private JPanel top;
	private boolean cl;
	private paneldata paneldata;
	
/// constructor////
	public panel()
/// initiating////	
	{ button=new JButton ("Calculate");
	button.setPreferredSize(new Dimension (WIDTH,100));
	button.setForeground(Color.BLUE);
	button.setFont(new Font ("Arial",1,40));
	display =new JTextArea();
	display.setFont(new Font ("Arial",2,40));
	display.setForeground(Color.black);
	
	new JLabel("Enter number:");
	
	top=new JPanel();

	top.setPreferredSize(new Dimension (WIDTH,100));
/// layout////
	setLayout (new BorderLayout());
	
	add(display,BorderLayout.CENTER);
	add(button,BorderLayout.PAGE_END);
	
	button.addActionListener(this);
		
		
	
	
	
	
	
	}
	public void setSqrt(Double sqrt) {
		this.sqrt = sqrt;
	}
	@Override 
	public void actionPerformed(ActionEvent e) {
		
	if(e.getSource()==button)
	{cl=true;
	}
	
	
	//System.out.println(cl);
		panelevent pe=new panelevent(this, cl);
		if(paneldata!=null)
		paneldata.getClicked(pe);
	}
	
		
	
	public void setInterface (paneldata pd)
	{
		this.paneldata =pd;
	}
	panelevent pe =new panelevent (this,cl);

	public void append(double b)  {
		
		double c=Math.sqrt(b);
		display.setText(c+"");}
		
			
		
		
	
		

	public void warnning() {
		display.setForeground(Color.RED);
		display.setText("Enter a valid postive number");
		
		
	}
}