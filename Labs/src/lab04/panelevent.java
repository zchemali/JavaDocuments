package lab04;

import java.util.EventObject;



public class panelevent extends EventObject {
 private boolean clicked;
	public panelevent(Object source,boolean clicked) {
		super(source);
		this.clicked=clicked;
		
	}
	public boolean getClicked() {
		return clicked;
	}
	
	
}
