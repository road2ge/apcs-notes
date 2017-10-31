
/**
 * Implements an application simulating a slot machine.
 * 
 * @author Kale Miller
 * @version 25 October 2017
 */

import java.util.*;
public class Program15
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3;
        String play = "spin";
        System.out.println("Thank you for having me simulate gambling!");
        System.out.println("enter s to spin");
        play = scan.nextLine();
        while (play.equalsIgnoreCase("s"))
        {
            num1 = (int)(Math.random() * 10);
            num2 = (int)(Math.random() * 10);
            num3 = (int)(Math.random() * 10);
            System.out.println(num1 + " " + num2 + " " + num3);

            //check if all 3 are same
            if(num1 == num2 && num2 == num3)
                System.out.println("All 3 the same!!");
            //now check if 2 are same
            else if (num1 == num2 || num2 == num3 || num1 == num3)
                System.out.println("2 numbers the same!!");
            System.out.println("enter s to spin, anything else to exit");
            play = scan.next();
        }
    }
}
