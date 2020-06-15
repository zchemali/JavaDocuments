package SearchingAlgorithm;


import java.sql.Array;
import java.util.Arrays;

import jdk.nashorn.internal.runtime.arrays.ArrayData;

public class App {
static SequentialSearch sq;
static BinarySearch bs;
	public static void main(String[] args) {
sq=new  SequentialSearch();
bs=new BinarySearch();

String[] tem={"HI", "MY","NAME","is","Ziad"};
/*if(sq.getMatch(tem,"k")!=-1)
System.out.println("it is at index: "+sq.getMatch(tem,"Ziad]"));
	
	else 
		System.out.println("Item not found");*/

Integer [] temp = {11,3,2,21,4,2,10,3,0,2,5,-2};
Arrays.sort(temp);
//SelectionSorting.sort2(temp);
StringBuffer sb =new StringBuffer();
for (int i =0 ;i<temp.length;i++)
	sb.append(temp[i]+" ");
System.out.println(sb.toString());
if(bs.binarySearch(temp,3)!=-1)
System.out.println("it is at index: "+bs.binarySearch(temp,3));
	
	else 
		System.out.println("Item not found");


}
}