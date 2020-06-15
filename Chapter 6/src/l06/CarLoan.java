package l06;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Exercise 6.4
public class CarLoan {
	private static double[] inputs = new double[3];

	/**
	 * @param input takes a double array which has principal, rate ,year
	 * @return the maturatiy of bankc cd
	 */
	public double BankCd(double[] input) {
		return input[0] * Math.pow(1 + input[1] / 100, input[2]);
	}

	/**
	 * @return double array which contains the user inputs
	 */
	public double[] userInput() {
		boolean check = true;
		//Scanner sc = new Scanner(System.in);

		while (check == true)
			try {
				{
					System.out.println("Principal value:");
					Scanner sc = new Scanner(System.in);

					double g = sc.nextDouble();
					if (g > 0) {
						inputs[0] = g;
						check = false;
					} else
						System.err.println("please enter postive number");
				}
			} catch (Exception e) {
				System.err.println("Please enter valid number");

			}

		check = true;
		while (check == true)
			try {
				{
					System.out.println("rate value:");
					Scanner sc = new Scanner(System.in);

					double g = sc.nextDouble();
					if (g > 0 && g < 100) {
						inputs[1] = g;
						check = false;
					} else
						System.err.println("please enter postive number between 0 and 100");
				}
			} catch (Exception e) {
				System.err.println("Please enter valid number");

			}
		check = true;
		while (check == true)
			try {
				{
					System.out.println("years value:");
					Scanner sc = new Scanner(System.in);

					double g = sc.nextDouble();
					if (g > 0) {
						inputs[2] = g;
						check = false;
					} else
						System.err.println("please enter postive number ");
				}
			} catch (Exception e) {
				System.err.println("Please enter valid number");

			}

		return inputs;
	}

	/**
	 * @param input takes the user inputs and generates a table with increments for
	 *              year and rate this method invokes the BankCD method to obtain
	 *              result at each (row,col) location of the table
	 */

	public void print(double[] input) {

		System.out.print("        ");
		for (int col = 1; col <= input[1]; col++) {
			System.out.print(col + "%          ");
		}
		System.out.println("\n");
		for (int row = 1; row <= input[2]; row++) {
			System.out.print("year " + row + ": ");
			for (int col = 1; col <= input[1]; col++) {
				double[] tem = new double[] { input[0], row, col };
				NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
				nf.setMaximumFractionDigits(0);
				System.out.print(nf.format(BankCd(tem)) + "   ");

			}
			System.out.println("\n");

		}

	}

//main method simply creates objects class and invoke the print method which takes userInput return as an argument
	public static void main(String[] args) {

		CarLoan carloan = new CarLoan();
		carloan.print(carloan.userInput());

	}

}
