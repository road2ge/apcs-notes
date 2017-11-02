
/**
 * Prints asterisks in a nice shape.
 * 
 * @author Kale Miller
 * @version 1 November 2017
 */
import java.util.*;
public class Program12_c
{
    public static void main(String[] args) {
        //i is the number of spaces, subtract from spaces on println
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < i; j++) {
               //print appropriate number of spaces
               System.out.print(" ");
            }
            //print appropriate number of asterisks with \n
            System.out.println("**********".substring(0,10-i)); 
        }
    }
}
