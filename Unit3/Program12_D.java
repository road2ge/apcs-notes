
/**
 * Write a description of class Program12_D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Program12_D
{
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++){
            System.out.print("     ".substring(i,5));
            System.out.print("*********".substring(0,i*2-1));
            System.out.println("");
        }
        for(int i = 0; i < 5; i++){
            System.out.print("     ".substring(0,i));
            System.out.print("*********".substring(0,9-i*2));
            System.out.println("");
        }
    }
}
