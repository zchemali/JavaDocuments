
package l06;
//Exercise 6.9
public class SkiJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=0;row<7;row++) {
			System.out.print(row+1+". ");
		for(int col=0;col<=row;col++)
			
		System.out.print("# ");
	
		System.out.println("");
	}
		System.out.println("");

	int row=0;
while(row<7)
{int col=0;
System.out.print(row+1+". ");
	while (col<=row)
	{
		System.out.print("# ");
		col++;
	}
	System.out.println("");
	row++;
}
System.out.println("");
int row1=0;
do {
	System.out.print(row1+1+". ");
	int col1=0;
	do {
		System.out.print("# ");
		col1++;
	}while (col1<=row1);
	System.out.println("");
	row1++;
}
while( row1<7);

}
}