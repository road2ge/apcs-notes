
/**
 * coins in jar - dollars
 *
 * @author Kale Miller
 * @version 10/9/2017
 */
import java.util.*;
public class Program12
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input amount of quarters, then dimes, then nickles, then pennies.");
        int quarters = scan.nextInt();
        int dimes = scan.nextInt();
        int nickels = scan.nextInt();
        int pennies = scan.nextInt();
        int total_cents = quarters*25 + dimes*10 + nickels*5 + pennies;
        double total = total_cents / 100.0;
    }
}
