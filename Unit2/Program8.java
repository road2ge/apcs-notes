
/**
 * Uses distance formula to find distance between two points.
 * 
 * @author Kale Miller
 * @version 10/3/2017
 */
import java.util.*;
public class Program8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("This will use the distance formula to find the distance between two points you define.");
        System.out.println("Please read carefully.");
        System.out.println("Input the first x value, then the second x, then the first and second y.");
        System.out.println("Hit enter after each value.");
        double x1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("The distance between the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);
    }
}
