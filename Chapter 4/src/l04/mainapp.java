package l04;

public class mainapp {
	private KeyboardReader kr;
	private SquareRootApp sq;
	private static double x;
	private static int y;

	public mainapp() {
		kr = new KeyboardReader();
		sq = new SquareRootApp();
	}

	public static void main(String[] args) {
		mainapp ma = new mainapp();
		ma.kr.prompt("Please Enter a  double number: ");
		x = ma.kr.getKeyboardDouble();
		ma.kr.prompt("Please Enter an Integer number: ");
		y = ma.kr.getKeyboardInit();
		ma.kr.prompt("The square root of the double: " + x + " is :" + ma.sq.getDoublesqrt(x));
		ma.kr.prompt("The square root of the integer: " + y + " is :" + ma.sq.getintesqrt(y));

	}
}
