package l10;

public class UnCheckedException {
	
	
	
	public static void main (String [] args) {
		char c;
		String s="25.2";
		String[] s1= {"1,2,3","@@"};
		try {
			c=Character.toUpperCase(s1[0].charAt(0));
			c=s.charAt(s.length());
		System.out.println(Integer.parseInt(s));
		}catch (NumberFormatException e) {
		System.out.println(e);	
		}catch(StringIndexOutOfBoundsException e) {
		System.out.println(e);	}catch(Exception e) {
			System.out.println(e);
		}
	}

}
