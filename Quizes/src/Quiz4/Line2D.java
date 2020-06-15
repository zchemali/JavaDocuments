package Quiz4;

public class Line2D {
	// Initializing variables
	private int x1 = 0, x2 = 5, y1 = 0, y2 = 10;

	/**
	 * Overriding the toString() method
	 */
	@Override
	public String toString() {
		return "Line starts at (" + x1 + "," + y1 + ") ends at (" + x2 + "," + y2 + ")";
	}

	public static void main(String[] args) {
		// creating an instance of class Line2D
		Line2D n = new Line2D();
		// printing result to screen by invoking toString() method
		System.out.println(n.toString());
	}

}
