
/**
 * Take seconds, convert to h,m,s
 * 
 * @author Kale Miller 
 * @version 10/2/17
 */
import java.util.*;
public class Program7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        System.out.println("You will input total seconds, and be given hours,mins,secs. Press enter after inputing seconds");
        int given = scan.nextInt();
        // find total hours
        hours += (int)given/3600;
        given -= hours*3600;
        // find total mins
        minutes += (int)given/60;
        given -= minutes*60;
        seconds = given;
        System.out.println("Total hours: " + hours + ", total minutes: " + minutes + ", total seconds: " + seconds);
    }
}
