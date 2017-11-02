
/**
 * Implements an application that produces a multiplication table, showing the results of multiplying the integers 1 through 12 by themselves.
 *
 * @author Kale Miller
 * @version 31 October 2017
 */
import java.util.*;
public class Program7
{
    public static void main(String[] args) {
        for(int i = 1; i < 13; i++) {
            for(int j = 1; j < 13; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        } 
    }
}
