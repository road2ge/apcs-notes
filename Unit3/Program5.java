
/**
 * prints each letter in string on an individual line
 *
 * @author Kale Miller
 */
import java.util.*;
public class Program5
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        System.out.println("input string, press enter");
        string = scan.nextLine();
        for(int i = 0; i < string.length(); i++) {
            System.out.println(string.substring(i,i+1));
        }
    }
}
