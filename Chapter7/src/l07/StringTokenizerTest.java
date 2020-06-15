package l07;

import java.util.StringTokenizer;
// useful method to read from csv file
public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="20,5,3,2,4442";
		String delim=",";
				StringTokenizer parts =new StringTokenizer(s, delim, false);
				while(parts.hasMoreTokens())
				{
				System.out.println(parts.nextToken().trim());
				
				}

}
}