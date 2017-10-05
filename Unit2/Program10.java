/**
 * Uses Heron's formula to calculate are from  given triangle dimensions.
 * The triangle is not guaranteed to be possible.
 *
 * @author Kale Miller
 * @version 10/4/17
 */
import java.util.*;
public class Program10
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("You will input the dimensions of a triangle, as positive integers, pressing enter after each.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double s = (a+b+c)/2;
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("The area of that triangle is " + area);
    }
}