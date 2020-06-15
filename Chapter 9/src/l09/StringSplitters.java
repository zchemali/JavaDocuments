package l09;

public class StringSplitters {
	public static void print (String [] d) {
		for (int i=0 ;i<d.length;i++) {
			System.out.println(i+": "+d[i].trim());}//trim rempves spaces
			System.out.println("\n");
		
	}
	public static void main(String[] args) {
String s= "Hello!! My name is Ziad.\nI like working out. Do you like working out ?";
String csv= " 12,13,15,16,17\n";
//every space
String[] parts =s.split("\\s");
print (parts);
//splits every . /!/?
String[] parts2 =s.trim().split("[.!?]");
print (parts2);
//splits after commas.
String[] parts3 =csv.trim().split("[,]");
print (parts3);

	}

}
