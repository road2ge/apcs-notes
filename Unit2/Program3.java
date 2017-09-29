
/**
 * takes 2 floats and prints stuff
 * 
 * @author Kale Miller 
 * @version 9/29/2017
 */
import java.util.*;
public class Program3
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("You will enter two numbers. Press enter after each one.");
       double double1 = scan.nextDouble();
       double double2 = scan.nextDouble();
       double sum = double1 + double2;
       double diff = double1-double2;
       double product = double1 * double2;
       System.out.println("The sum is " + sum + ", the difference is " + diff + ", and the product is "
                          + product + ".");
    }
}
