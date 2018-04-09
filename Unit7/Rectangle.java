
/**
 * Write a superclass named Rectangle that has the following methods and attributes:
 *   Two private instance variables of type double representing the length and
 *    width of the rectangle.
 *   A constructor that accepts values for both the length and width of the
 *    rectangle.
 *   Getter and setter methods for both the length and width.
 *   A getDiagonal() method that finds and returns the length of the diagonal of
 *    the rectangle.
 *   A getArea() method that finds and returns the area of the rectangle.
 *   A getPerimeter() method that finds and returns the perimeter of the
 *    rectangle.
 *   A toString() method that returns the current length and width of the
 *    rectangle.
 * 
 * @author Kale M
 * @version 2/26/18
 */
public class Rectangle
{
    private double length;
    private double width;

    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }

    public void setLength(double l)
    {
        length = l;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getDiagonal()
    {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2)); //A^2+B^2=C^2 
        
        /*
         *        d
         *       _i___
         *      | a /|
         *      | g/ |
         *      | /o |
         *      |/_n_|
         *         a
         *         l
         */
        
    }
    
    public double getArea()
    {
        return length*width;
    }
    
    public double getPerimeter()
    {
        return 2*length + 2*width;
    }
    
    public String toString()
    {
        return "\nLength: "+length+"\nWidth: "+width;
    }
}