
/**
 * Implents an application designed to read a set of values ranging from 1 to 100
 * from the user and then create a chart showing how often the values appeared.
 *
 * @author Kale Miller
 * @version 2/2/2018
 */
import java.util.*;
public class Program4
{
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> values = new ArrayList<>();
    System.out.println("enter numbers 1-100, enter out of range to stop: ");
    int temp = scan.nextInt();
    while(temp > 0 && temp < 101) {
        xd.add(temp);
        temp = scan.nextInt();
    }
    System.out.println(xd);
}
