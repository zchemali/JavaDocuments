package lab09;

public class AnalyzeFreq {

	private LetterFreq [] lf;
	public AnalyzeFreq () {
		//you intialize the array
		lf=new LetterFreq [26];
		for (int i=0 ;i<26;i++)
		{//intialize the letterFre object and passing a letter to its  costructor
			lf[i]= new LetterFreq((char)('A'+i));
		}
			
	}
	public static void main(String[] args) {

		String s =" Hello I like pizza I like to eat pizza every day if Ican";
		AnalyzeFreq af =new AnalyzeFreq();
		//invoking counting letter method by using a for loop to go through all the letterFreq array
		 for (int i=0 ; i< af.lf.length;i++)
			 af.lf[i].countLetters(s);
		
	//goes through all the letterFreq objects and invoke the return lettte and retunr freq methods .
	 for (int i=0 ; i< af.lf.length;i++)
		System.out.println("Letter "+af.lf[i].getLetter()+"  Freq: "+af.lf[i].getFreq());

}}
