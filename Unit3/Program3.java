
/**
 * Modified program 2.
 *
 * @author Kale Miller
 * @version 31 October 2017
 */
import java.util.*;
public class Program3
{
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter year as integer (greater than 1582, enter less than that to exit): ");
            int year;
            year = scan.nextInt();
        while(year > 1582) {
            if(year % 4 != 0) 
                System.out.println("not leap year.");
            else if(year % 100 == 0 && year % 400 != 0)
                System.out.println("not leap year.");
            else
                System.out.println("leap year");
            System.out.println("enter year as integer (greater than 1582, enter less than that to exit): ");
            year = scan.nextInt();
        }
    }
}
