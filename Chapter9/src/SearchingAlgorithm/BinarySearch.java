package SearchingAlgorithm;

public class BinarySearch {

	public <E extends Comparable<E>> int binarySearch (E[] data,E key) {
		int length=data.length;
		int initial=0;
		int mid = 0;
		int count =1;
		while (initial<=length) {
		//if((length-initial)%2==1)
		//	{mid=(length-1+initial)/2;}
		//else if ((length-initial)%2==0)
			{mid=(length+initial)/2; //~mid
			}
		System.out.println("mid for iteration"+count+"is "+mid);
			
				if(data[mid].compareTo(key)==0)	
					{return mid;
					}
				else if (data[mid].compareTo(key)<0)
					initial=mid;
				else 
					length=mid;
				count++;
				
					
			}
		
			
			
	
		return -1;
		
}
}