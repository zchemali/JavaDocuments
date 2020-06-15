package l04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardReader {
private BufferedReader reader;
public KeyboardReader ()
{
	reader=new BufferedReader (new InputStreamReader(System.in));
}
public void prompt (String s)
{
	System.out.println(s);
}
public double getKeyboardDouble ()
{
	
	return Double.parseDouble(readInput());
}
public int getKeyboardInit ()
{
	
	return Integer.parseInt(readInput());
}
public String readInput ()
{
	try {
		
		return reader.readLine();
	}
	catch (Exception e) {
	System.out.println("SSD"+e);
	return null;}
}
}
