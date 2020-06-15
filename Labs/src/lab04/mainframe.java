package lab04;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class mainframe extends JFrame {

private panel p;
private toolbar tb;
boolean clicked;
	public mainframe()
	{	p=new panel();
	tb=new toolbar();
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new BorderLayout());
		add(p,BorderLayout.CENTER);
		add(tb,BorderLayout.NORTH);
		
		
		p.setInterface(new paneldata() {

			@Override
			public void getClicked(panelevent pe) {
				clicked=pe.getClicked();
				if(clicked)
				{
					double b=tb.getTxt();
					if (b>0)
						p.append(b);
					else
						
						p.warnning();
					}
					
				}
			
			
		});

	}

}
