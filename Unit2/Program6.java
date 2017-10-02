
/**
 * Takes hours, minutes, seconds and prints total seconds
 * 
 * @author Kale Miller
 * @version 9/29/2017
 */
import java.util.*;
public class Program6
{
    public static void main(String[] args)
    {
        int total = 0;
        double temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("You will enter total hours, then minutes, then seconds. Press enter between each one.");
        /* check out these apples.
         * We know that hours to seconds is hours * 60 minutes to an hour * 60 seconds to a minute. The units cancel to just seconds.
         * So basically, hours * 60 ^ 2 = seconds, and minutes * 60 ^ 1 = seconds.
         * To get the seconds, it's 60 * 0. It's like a for loop that counds down from 2 to 0, inclusive.
         * Normally we write for loops to increase to an exclusive top. This for is counter-intuitive, but we can technically
         * increment downwards and be inclusive, it's just not normal.
         */
        for(int i = 2; i >= 0; i--)
        {
            temp = scan.nextInt();
            total += temp * (Math.pow(60,i));
        }
        System.out.println(total + " is the total amount of seconds");
    }
}
