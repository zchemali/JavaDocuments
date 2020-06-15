package l02;
import java.util.Scanner;
import java.io.*;


/* asks to fill question,answer,hint and stores in txt file*/

public class  Riddle extends Object{
public String question;
public String answer;
private String hint;
protected static String input1;
protected static String input2;
protected static String input3;
public void newfile (String x, String y, String z)
{
	try {
File f =new File ("C:\\Users\\zchem\\OneDrive\\Desktop\\University\\Spring\\ENSF 593\\Text book tests\\Chapter 2\\userinput.txt");
FileWriter fw =new FileWriter(f);
boolean b=f.exists();


if(!b)
{
	f.createNewFile();
	
	}
BufferedWriter bw=new BufferedWriter(fw);
bw.write(x+"\n"+y+"\n"+z);
bw.close();

}
	catch (Exception e)
	{System.out.println(e);}
}
public Riddle (String a , String b, String c)
{
	this.question=a;
	this.answer=b;
	this.hint=c;
}
public String getQuestion()
{
	return question;
}
public String getAnswer()
{
	return answer;
}
public String getHint(String a)

{
	if (a.equals("yes"))
			 { return hint;}
	else {
		return getQuestion();
		}

}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(" what is the question");
	 input1=(new Scanner(System.in).nextLine());
	System.out.println(" what is the answer");
	 input2=new Scanner(System.in).nextLine();
	System.out.println(" what is the hint");
	 input3=new Scanner(System.in).nextLine();
Riddle r =new Riddle(input1,input2,input3);
r.newfile(input1, input2, input3);

	}


}
