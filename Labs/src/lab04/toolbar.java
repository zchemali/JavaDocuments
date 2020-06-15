package lab04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class toolbar extends JPanel {
	private JTextField tf;
	private JLabel j;
	public toolbar () {
		j=new JLabel ("Enter number:");
		tf=new JTextField(5);
		tf.setFont(new Font ("Arial",1,40));
		tf.setForeground(Color.BLUE);
		j.setForeground(Color.BLUE);
		j.setFont(new Font ("Arial",1,40));
		setLayout(new FlowLayout());
		add(tf,FlowLayout.LEFT);
		add(j,FlowLayout.LEFT);
		
	}
	public double getTxt()
	{if (Double.parseDouble(tf.getText())>=0){
		return Double.parseDouble(tf.getText());
	}
	else {
      return -10001;
}}}
