package Quiz4;

public abstract class Container {
	
	protected String a,b,c,d;
	
	public Container(String kind)
	{
		this.a=kind;;
		
	}
	public void print1 () {
		System.out.println("Hello");
	}
	public abstract void print2();
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	

}
