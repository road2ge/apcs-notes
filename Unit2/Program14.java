
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
            double num = (Math.random() * 888);
            double num2 = Math.random() * 76100.0;
            String number = "(";
            String temp2 = "" + num;
            String temp = "" + num2;
            number = number + temp2.substring(0,3)    + temp2.substring(4,6) + ") " + temp.substring(0,3) + "-" + temp.substring(9,12);
            System.out.println(number);
        }
    }
}
