package l09;

public class ArraysExample {
	public static void print (double [] d) {
		for (int i=0 ;i<d.length;i++) {
			System.out.println(d[i]+" ");}
			System.out.println("\n");
		
	}
	public static void modifier (double [] d , int i , double value) {
		d[i]=value;
	}
	public static double[] pureModifier (double [] d ,int i ,double value)
	{
		double [] temp =d.clone();
		temp[i]=value;
		return temp;
	}

	public static void main(String[] args) {
	
    double []d = {1.2,2.3,4.3};
    print(d);
    modifier (d,2,6);
    print (d);
    double [] clone =pureModifier(d, 1, 7);
    print (clone);
    
	}
}
