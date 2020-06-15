package Sorting;
//swapping the first element for the smallest number
public class SelectionSorting {
	public static void sort2(Integer[] temp2) {
		int count=0;
		for(int i=0;i<temp2.length-1;i++) {
			int index=i;
			for(int k =i+1;k<temp2.length;k++) {
				if(temp2[k]<temp2[index]) {
					index=k;
				;}}
			int temp =temp2[index];
			temp2[index]=temp2[i];
			
			temp2[i]=temp;
		
			}
		}
	
	}


