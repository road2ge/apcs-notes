
/**
 * User miles to kilometers
 * 
 * @author Kale Miller
 * @version 9/29/2017
 */
import java.util.*;
public class Program5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("You will enter an amount of miles to be converted to kilometers. Hit enter when done.");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.60935;
        System.out.println(miles + " miles is " + kilometers + " kilometers.");
    }
}
