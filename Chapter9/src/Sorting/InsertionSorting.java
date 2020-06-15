package Sorting;

public class InsertionSorting {
	public static void sort1(int[] data) {
		
		for(int i=1;i<data.length;i++) {
			
			int temp =data[i];
			for(int k=i-1;k>=0;k--) { 
				if(data[k]>temp) { 
					data[k+1]=data[k];
					data[k]=temp;
					
				}
				
			}
			
			
			
		}
	}

}
