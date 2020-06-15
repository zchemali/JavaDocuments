package lab09;

public class LetterFreq {
	private char letter ; 
	private int freq ; 
	public LetterFreq (char ch ) 
	{ letter = ch; 
	freq = 0 ; }
	public void countLetters (String string) {
		for (int i=0 ; i<string.length();i++) {
			if(Character.toUpperCase(string.charAt(i))==letter)
				incrFreq();	
		}
	}
	public char getLetter () 
	{ return letter ; } 
	public int getFreq () 
	{ return freq ; }
	public void incrFreq () 
	{ freq++; } } 
