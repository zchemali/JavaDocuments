/* this reads data from txt file and interacts with user to get riddle answer 
@version 2.0
 * */
 
package l02;

import java.util.Scanner;
import java.io.*;

public class RiddleUser {

private static String x;
private static String y;
private static String z;
public String read() {
try {
File f =new File ("C:\\Users\\zchem\\OneDrive\\Desktop\\University\\Spring\\ENSF 593\\Text book tests\\Chapter 2\\userinput.txt");
BufferedReader br =new BufferedReader(new FileReader(f));

 
if (f.exists())
{
	
		RiddleUser.x=br.readLine();
		RiddleUser.y=br.readLine();
		RiddleUser.z=br.readLine();
	
return "Sucess" ;
}
else 
{return "fail";}
	
} catch (Exception e)
{
	System.out.print(e);
	return "fail";}}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	RiddleUser n=new RiddleUser();
	
	String q=n.read();
	Scanner s =new Scanner(System.in);
System.out.println(" do you want a hint?");
String f =s.nextLine();
if(f.equals("yes"))
{System.out.println(z);
}

	
	System.out.println (x);
	
String ans=s.nextLine();

if(ans.contentEquals(y))
{
	System.out.println("Correct");
}
else
{
	for(int i=3; i > 0; i--)
{ 
	System.out.println("you have "+i+" more tries");
	ans=s.nextLine();
	if(ans.equals(y))
	{System.out.println("Correct");
	return;}
	else if(i==1)
	{System.out.println("no the answer is :" + y);
		return;
	}
	}
	
}}}
	




