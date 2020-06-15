package Quiz4;

import sun.nio.cs.ext.ISCII91;

public class Question1 {
	static double[] dd = {1.0, 3.0, 5.0, 7.0, 9.0};
	static int[] ii = {1, 3, 5, 7, 9};
	public static void main(String[] args) {
		System.out.println("Length: "+dd.length);
		System.out.println(dd[ii[1]]);
		System.out.println(dd[0]=ii[0]);
	//	System.out.println(ii[0]=dd[0]);
		if(dd[3]==ii[3])
			System.out.println("yes");
		
	}

}
