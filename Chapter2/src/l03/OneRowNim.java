package l03;

public class OneRowNim extends Object{
private int nSticks;
private int player;
public OneRowNim ()
{
	nSticks=21;
	player=1;
}

public OneRowNim(int Sticks)
{
	nSticks=Sticks;
	player=1;
}

public static void myMethod( OneRowNim g)
{
	g.nSticks=0;
}
@Override

public String toString ()
{
	return "Players: " + player +" Sticks:"+nSticks;
}
/**
 * this is only pseudo-overriding
 * @param that
 * @return 
 */
public boolean equals (OneRowNim that)
{
	return (this.nSticks==that.nSticks) && (this.player==that.player);
}
	public static void main(String[] args) {
		OneRowNim nim1 = new OneRowNim();
		OneRowNim nim2 =new OneRowNim(5);
		System.out.println(nim1);
		myMethod(nim1);
		System.out.println(nim1);
		
		//System.out.println(nim1.toString());
		//System.out.println(nim2.toString());
		
		/*polymorphism
		Object obj;
		obj=new Student ("123");
		System.out.println(obj.toString());
		obj=new OneRowNim(8);
		System.out.println(obj.toString());
	*/
		// this equals refers to onenime method NOT the Object's method
	//	System.out.println(nim1.equals(nim2));
	}

}
