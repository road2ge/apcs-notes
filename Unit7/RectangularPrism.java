
/**
 * Write a subclass, RectangularPrism, that extends Rectangle. This class
 * should have the following additional methods and attributes:
 *   A private instance variable of type double representing the height of the
 *      prism.
 *   A constructor that accepts values for the length, width and height of the
 *      prism. This should include a call to the parent class’ constructor.
 *   Getter and setter methods for the height.
 *   A getArea() method that overrides the method in the parent class. This
 *      method will find and return the surface area of the prism. This method should
 *      include a call to the overridden method found in the parent class and could
 *      include the inherited getPerimeter() method (although it isn’t necessary).
 *   A getDiagonal() method that overrides the method in the parent class. This
 *      method will find and return the diagonal of the prism (a picture is shown
 *      below...this is very different from the diagonal of a rectangle). This method
 *      should include a call to the overridden getDiagonal() method found in the
 *      parent class.
 *   A getVolume() method that finds and returns the volume of the prism. This
 *      should include a call to the getArea() method found in the superclass.
 *   An isCube()method that returns true if the prism is a cube and false
 *      otherwise.
 *   An overridden toString() method that returns the current length, width,
 *      and height of the given prism. This method should include a call to the
 *      overridden method found in the parent class.
 * 
 * @author Kale M
 * @version (a version number or a date)
 */
public class RectangularPrism extends Rectangle
{
    private double height;
    
    public RectangularPrism(double l, double w, double h)
    {
        super(l, w);
        height = h;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public void setHeight(double h)
    {
        height = h;
    }
    
    public double getArea()
    {
        return (this.getPerimeter()*height) + (2*super.getArea());
    }
    
    public double getVolume()
    {
        return this.getLength()*this.getWidth()*height;
    }
    
    public double getDiagonal()
    {
        return Math.sqrt(Math.pow(this.getLength(),2)+Math.pow(this.getWidth(),2)+Math.pow(height,2));
    }
    
    public boolean isCube()
    {
        return (this.getLength() == this.getWidth() && this.getWidth() == height);
    }
    
    public String toString()
    {
        return super.toString() + "\nHeight: "+height;
    }
 //yaaaaaaaay!
 
 /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
  /*
  * RECTANGLE       
  * E       L
  * C       G
  * T       N
  * A       A
  * N       T      
  * G       C
  * L       E
  * ELGNATCER
  */
}
