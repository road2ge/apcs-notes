 

public class GradingDriver1
{
    public static void main(String[]args)
    {
        RectangularPrism bob = new RectangularPrism(5,7,8);
        System.out.println("Area: " + bob.getArea() + " square units");
        System.out.println("Volume: " + bob.getVolume() + " cubic units");
        System.out.println("Diagonal: " +  bob.getDiagonal() + " units");
        
        if(bob.isCube())
            System.out.println("This is a cube.");
        else
            System.out.println("This is not a cube.");
            
        System.out.println();
        System.out.println(bob);
    }
}