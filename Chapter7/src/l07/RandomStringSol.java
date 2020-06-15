package l07;

public class RandomStringSol {

	public static void main(String[] args) {
		String possible ="avfsdfsdre+sdsd";
		int nChar =10;
		StringBuffer password =new StringBuffer ("");
		
		for (int i=0; i<nChar;i++)
		{
			
			int idx =(int) (Math.random()*possible.length());
			
			password.append(possible.charAt(idx));
		}
		System.out.println(password);
	}

}
