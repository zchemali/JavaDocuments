package Quiz3;

// This class turns characters at odd valued indices of a string to capital letters.  
public class LetterCaseConverter {
	/**
	 * This method turns characters at odd valued indices of a @param s1 to capital
	 * letters.
	 * 
	 * @param s1 is the string that is passed from the main method
	 * @return the StringBuffer of the converted String @param s1
	 */
	public StringBuffer convertLetters(String s1) {

		StringBuffer sb = new StringBuffer(s1);
		for (int i = 0; i < sb.length(); i++) {
			if (i % 2 == 1)
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));

		}
		return sb;
	}

	/**
	 * Main method where the LowerCaseConverter class is instantiated and then
	 * invoke convertLetters() method. The return of the method is then displayed on
	 * the screen
	 **/
	public static void main(String[] args) {
		LetterCaseConverter lc = new LetterCaseConverter();
		System.out.println(lc.convertLetters("Hello my Name is ZIAD"));

	}

}
