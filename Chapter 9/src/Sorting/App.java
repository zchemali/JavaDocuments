package Sorting;

public class App {
	public static void print (int [] data) {
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] test= {2,3,1,4,5,2,8,4,0,1,2,3};
		System.out.println(test.length+" length before");
		//SelectionSorting.sort2(test);
		print(test);
		System.out.println(test.length+" length after");
		
		
	}

}
