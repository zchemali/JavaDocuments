package SearchingAlgorithm;

public class SequentialSearch {
	public <E> int getMatch (E[] data,E e){
		
		for (int i=0; i<data.length;i++) {
			if(data[i]==e)
				return i;
		
				
			
		}
		return -1;
	}

}
