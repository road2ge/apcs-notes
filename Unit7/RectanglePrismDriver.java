
/**
 * Is no very good at driving
 * 
 * @author Kale M
 * @version 2/27/18
 */
public class RectanglePrismDriver
{
    public static void Main(String[] args)
    {
        RectangularPrism normie = new RectangularPrism(12.5, 32.6, 10.8);
        RectangularPrism cube = new RectangularPrism(10.0, 10.0, 10.0);
        Rectangle rect = new Rectangle(10.0, 20.0);
        
        System.out.println(normie.toString()+
        cube.toString()+
        rect.toString()+
        
        
        normie.getArea()+
        cube.getArea()+
        rect.getArea());
        
        
    }
}
