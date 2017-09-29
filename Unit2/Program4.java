
/**
 * Farenheit to Celsius
 * 
 * @author Kale Miller
 * @version 9/29/2017
 */
import java.util.*;
public class Program4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a temperature in degrees Farenheit");
        double f = scan.nextDouble();
        double c = (f -32) * 5/9;
        System.out.println(f + " degrees Farenheit is " + c + " degrees Celsius");
    }
}
