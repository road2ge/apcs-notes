
/**
 * A class named Retangle to represent a rectangle.
 * 
 * @author Kale Miller
 * @version 11/20/2017
 */
public class Rectangle
{
    private double length, width;
    //constructors
    public Rectangle() {
        length = 1; 
        width = 1;        
    }
    public Rectangle(double l,double w) {
    	length = l;
    	width = w;
    }

    //methods
    public double getArea() {
    	return length*width;
    }
    public double getPerimeter() {
    	return 2 * (length + width);
    }
    //getters and setters
    public double getWidth() {
    	return width;
    }
    public void setWidth(double w) {
    	width = w;
    }
    public double getLength() {
    	return length;
    }
    public void setLength(double l) {
    	length = l;
    }
}
