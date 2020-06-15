package l10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
	public static int addPosition (int a, int b) {
	if(a<=0 || b<=0)	
		throw new IllegalArgumentException("Must be positve");
	return a+b;
	}
	
	public static int getIntFromUser() {
		boolean check=true;
		int temp = Integer.;
		while(check) {
			try {
				Scanner s=new Scanner (System.in);
				temp=s.nextInt();
				check=false;
			}catch (Exception e)
			{System.err.println(e.getClass());
			
			System.out.println("\n2Enter a valid number");
			
			}
		}
		return temp;
	}
public static void main (String[] args) throws FileNotFoundException{
	//Scanner s=new Scanner (new File("test.csv"));
	//or you can use a try/catch
	System.out.println("Enter a number a");
	int a=getIntFromUser();
	System.out.println("Enter a number a");
	int b=getIntFromUser();
	System.out.println(addPosition(a,b));
}
}
