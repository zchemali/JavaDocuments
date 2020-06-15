package Quiz3;
// collects the small case chars in a sentence
public class Test {

	/**
	 * 
	 * @param sent is the String that is passed from the main method
	 * @return the StringBuffer that contains the lower cases of the @param sent
	 */
	public StringBuffer LowerCaseCollector(String sent) {

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < sent.length(); i++) {

			if (sent.charAt(i) >= 97 && sent.charAt(i) <= 122)
				sb.append(sent.charAt(i));
		}
		return sb;
	}

//main method
	public static void main(String[] args) {
		// creating new instance of class Test so we can use the methods in it
		Test t = new Test();
		/** Creating a StringBuffer to get the return of @LowerCaseCollector */
		StringBuffer sb = t.LowerCaseCollector("I Like Apples, but Tom doesn't");
		// prints out the result
		System.out.println(sb);

	}
}