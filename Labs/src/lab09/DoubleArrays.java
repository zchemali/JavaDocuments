package lab09;

public class DoubleArrays {

	public static void main(String[] args) {

		double [] d = {1.2,4.5,2.3};
		double [][] dd =new double [5][3];
		dd [1][2]=5.0;
		System.out.println("--- printing matrix---");
		//NOTE: dd.length gives number of rows in matrix
		//		dd[row].length gives how many emelemt are in rach row
		for (int row =0; row <dd.length ; row++)
		{
			for (int col=0;col<dd[row].length; col++) {
				System.out.print(dd[row][col] + " ");
			}
			System.out.println( (""));
		}
	
System.out.println("--- printing a single row---");
	/// printting an entire row
	int rowIndx=1;//means second row
	for (int col =0 ; col<dd[rowIndx].length;col++) {
		System.out.print( dd[rowIndx][col]+" ");
	}
	System.out.println("");

	System.out.println("--- printing a single col---");
	int colIndx=1;//means second column
	for (int row =0 ;row <dd.length;row++) {
		System.out.println(dd[row][colIndx]);
	}
	
}
}