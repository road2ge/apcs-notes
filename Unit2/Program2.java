
/**
 * omfg why
 * 
 * @author Kale Miller
 * @version 9/28/2017
 */
import java.util.*;
public class Program2
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       double sum = 0.0;
       for(int i = 0; i < 3; i++)
       {
           System.out.println("Type a number and then hit enter");
           sum = scan.nextDouble();
       }
       double average = sum/3;
       System.out.println("The average of those three numbers is " + average);
   }
}
