package lab05;

public class RandomCharApp {

	public static void main(String[] args) {
	int n=0;
	int numberOfChar=10;
	char randomChar='Z';
		float timer =System.currentTimeMillis();
		while (true) {
			double r=Math.random();
			if (randomChar==(char)(65+(91-65)*r)) {
				 
				 
				 System.out.println("we found "+ (char)(65+(91-65)*r));
			break;}
		}
	}

}
