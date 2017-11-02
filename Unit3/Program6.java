
/**
 * Implements an application designed to determine and print the number of odd, even, and zero digits
 * in an integer value read from the keyboard.
 * 
 * @author Kale Miller
 * @version 31 October 2017
 */
import java.util.*;
public class Program6
{
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Input the integer to analyze, then press enter: ");
       int int1 = scan.nextInt();
       //We need a copy of int1 to work with later
       int int2 = int1;
       //initialize the variables to count odds etc.
       int odd = 0;
       int even = 0;
       int zero = 0;
       int counter = 0;
       //declare the int to store each digit as
       int digit;
       //nifty condition: if we reach too many iterations, then this int1 % 10 ** counter will return int1
       while(int1 % (Math.pow(10,counter)) != int1)  {
           //gets lowest digit
           digit = int2 % 10;
           
           if (digit == 0) 
           {
                zero++;
           }
           else if (digit % 2 == 0) 
           {
                even++;
           }
           else 
           {
                odd++;
           }
           //we have to increment counter otherwise the conditional is meaningless and we have infinite loop
           counter++;
           //we can shift the decimal left and remove the decimal by simple integer division
           int2 /= 10;
       }
       System.out.println(zero + " zeroes, " + even + " evens, and " + odd + " odds in integer " + int1);
   }
}
