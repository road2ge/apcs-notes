
/**
 * mpg
 *
 * @author Kale Miller
 * @version 10/9/2017
 */
import java.util.*;
public class Program11
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input gas used, as decimal number, then the two odometer readings. Start then finish.");
        //fetch vars from input
        double gas = scan.nextDouble();
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        //calculate miles driven
        int miles = m2 - m1;
        //calculate mpg
        double mpg = miles/gas;
        System.out.println("The mpg for this trip was " + mpg);
    }
}
