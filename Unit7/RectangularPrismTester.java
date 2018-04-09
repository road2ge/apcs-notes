public class RectangularPrismTester
{
    public static void main(String[]args)
    {
        RectangularPrism joe = new RectangularPrism(8,12,10);
        System.out.println("Area: " + joe.getArea() + " square units");
        System.out.println("Volume: " + joe.getVolume() + " cubic units");
        System.out.println("Diagonal: " +  joe.getDiagonal() + " units");
        
        if(joe.isCube())
            System.out.println("This is a cube.");
        else
            System.out.println("This is not a cube.");
            
        System.out.println();
        System.out.println(joe);
    }
}