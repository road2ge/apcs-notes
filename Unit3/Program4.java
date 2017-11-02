
/**
 * Implementation of a designed application that reads an integer value and prints
 * the sum of all even integers between 2 and the input value, inclusive.
 * Prints an error message if the input value is less than 2. Prompts user accordingly.
 *
 * @author Kale Miller
 * @version 31 October 2017
 */
import java.util.*;
public class Program4
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int total = 0;
        System.out.println("input num, greater than 2");
        num = scan.nextInt();
        if(num>=2){
            for(int i = 0; i <= num; i++) {
                if(i%2 == 0) {
                    total += i;
                }
            }
            System.out.println(total + " is the sum of all even ints less than input, inclusive");
        }
        else
            System.out.println("num less than 2");
    }
}
