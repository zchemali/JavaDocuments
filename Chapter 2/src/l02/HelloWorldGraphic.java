package l02;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;
import java.awt.Graphics;

public class HelloWorldGraphic extends Canvas
{
/**
	 * 
	 */

public void paint (Graphics g)
{
	g.setColor(Color.CYAN);
	g.fillRect(25, 25, 140, 40);
	g.setColor(Color.blue);
	g.drawRect(25,25,140,40);
	g.setColor(Color.BLACK);
	g.drawString("Hello World", 50, 50);
	g.setColor(Color.yellow);
	g.fillOval(25, 75, 140, 40);
	g.setColor(Color.red);
	g.drawOval(25, 75, 140, 40);
	g.setColor(Color.BLACK);
	g.drawString("welcome to java", 50, 100);
}
public static void main (String[] args)
{HelloWorldGraphic c= new HelloWorldGraphic();
JFrame box =new JFrame("the box");
box.add(c);
box.setSize(150, 150);
box.setVisible(true);
	
}
}
