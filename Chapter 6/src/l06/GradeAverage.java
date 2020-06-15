package l06;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		System.out.print(" Enter grade ");
		double sum=0;
		int count=0;
		Scanner input =new Scanner (System.in);
		double grade=input.nextDouble();
		while (grade!=9999)
		{
			sum+=grade;
			System.out.print(" Enter grade ");
			grade=input.nextDouble();
			count++;
		}
		if(count>0)
		System.out.println("Grade averge is"+ sum/count);
	}

}
