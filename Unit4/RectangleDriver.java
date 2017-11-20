public class RectangleDriver {
	public static void main(String[] args) {
		Rectangle a = new Rectangle(40,4);
		Rectangle b = new Rectangle(35.9,3.5);
		System.out.println("The length of the first rectangle is " + a.getLength() + " inches.");
		System.out.println("The width of the first rectangle is " + a.getWidth() + " inches.");
		System.out.println("The area of the first rectangle is " + a.getArea() + " inches.");
		System.out.println("The perimter of the first rectangle is " + a.getPerimeter() + " inches.");
		System.out.println();
		System.out.println("The length of the second rectangle is " + b.getLength() + " inches.");
		System.out.println("The width of the second rectangle is " + b.getWidth() + " inches.");
		System.out.println("The area of the second rectangle is " + b.getArea() + " inches.");
		System.out.println("The perimter of the second rectangle is " + b.getPerimeter() + " inches.");
	}
}