package Quiz3;
// checks how many times math.random() retunrs number 0.5+-0.001
public class RandomTrials {

	
	
	private static int result;
	private static int i;

	public static void main(String[] args) {
		
		i = 1000;
		result = 0;
		while (i>0) {
			double r=Math.random();
		if(r>=0.5-0.001 && r<=0.5+0.001)
		{
			System.out.println(r);
			result++;
			
		}
		i--;
		
		
	}
		System.out.println(result);
}}
