package Quiz4;

/**
 * Rectangle class that implements the {@link IMeasurements} interface. The
 * interface has an abstract method getArea() which is Overridden below
 */
public class Rectangle implements IMeasurements {
	// Initializing variables
	private int x1 = 5, y1 = 5, x2 = 0, y2 = 0;

	public static void main(String[] args) {
		// Creating an instance of class Rectangle
		Rectangle r = new Rectangle();
		// invoking the getArea() method
		System.out.println(r.getArea());
	}

	/**
	 * Overriding the getArea() to return the area of the Rectangle.
	 */
	@Override
	public int getArea() {
		return Math.abs(x1 - x2) * Math.abs(y1 - y2);
	}

}
