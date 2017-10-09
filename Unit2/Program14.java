
/**
 * Optimized (tm) phone number generator
 * 
 * @author Kale Miller
 * @version 10/9/2017
 */
import java.util.*;
public class Program14
{
    public static void main(String[] args)
    {
        //testing purposes
        for(int i = 0; i < 30; i++)
        {
            double num = (Math.random() * 8);
            String number = "(";
            String temp = "" + num;
            number = number + temp.substring(0,1)    + temp.substring(2,4) + ") " + temp.substring(4,7) + "-" + temp.substring(8,11);
            System.out.println(number);
        }
    }
}
