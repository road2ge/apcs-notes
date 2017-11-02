
/**
 * Checks if year is leap year.
 *
 * @author Kale Miller
 * @version 31 October 2017
 */

import java.util.*;
public class Program2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter year as integer (greater than 1582): ");
        int year;
        year = scan.nextInt();
        if(year <=1582)
            System.out.println("error, year too low");
        else if(year % 4 != 0) 
            System.out.println("not leap year.");
        else if(year % 100 == 0 && year % 400 != 0)
            System.out.println("not leap year.");
        else
            System.out.println("leap year");
    }
}
