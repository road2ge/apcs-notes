
/**
 * Beer on the wall song
 *
 * @author Kale Miller
 * @version 2 November 2017
 */
import java.util.*;
public class Program9
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int verses;
        System.out.println("input number of verses");
        verses = scan.nextInt();
        if(verses<1)
            System.out.println("Why even run this program then?");
        else if(verses > 100)
            System.out.println("There are only 100 verses in this song:");
        else {
            for(int i = 100; i > 100 - verses; i--) {
                System.out.println(i + " bottles of beer on the wall");
                System.out.println(i + " bottles of beer");
                System.out.println("If one of those bottles should happen to fall");
                System.out.println(i-1 + " bottles of beer on the wall");
            }
        }
    }
}
